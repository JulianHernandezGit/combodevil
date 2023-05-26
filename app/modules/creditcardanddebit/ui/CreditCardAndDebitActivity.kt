package com.combodeals.app.modules.creditcardanddebit.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.combodeals.app.R
import com.combodeals.app.appcomponents.base.BaseActivity
import com.combodeals.app.databinding.ActivityCreditCardAndDebitBinding
import com.combodeals.app.modules.addcard.ui.AddCardActivity
import com.combodeals.app.modules.creditcardanddebit.`data`.model.ListvolumeRowModel
import com.combodeals.app.modules.creditcardanddebit.`data`.viewmodel.CreditCardAndDebitVM
import com.combodeals.app.modules.lailyfafebrinacard.ui.LailyfaFebrinaCardActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CreditCardAndDebitActivity :
    BaseActivity<ActivityCreditCardAndDebitBinding>(R.layout.activity_credit_card_and_debit) {
  private val viewModel: CreditCardAndDebitVM by viewModels<CreditCardAndDebitVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listvolumeAdapter = ListvolumeAdapter(viewModel.listvolumeList.value?:mutableListOf())
    binding.recyclerListvolume.adapter = listvolumeAdapter
    listvolumeAdapter.setOnItemClickListener(
    object : ListvolumeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListvolumeRowModel) {
        onClickRecyclerListvolume(view, position, item)
      }
    }
    )
    viewModel.listvolumeList.observe(this) {
      listvolumeAdapter.updateData(it)
    }
    binding.creditCardAndDebitVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnAddCard.setOnClickListener {
      val destIntent = AddCardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListvolume(
    view: View,
    position: Int,
    item: ListvolumeRowModel
  ): Unit {
    when(view.id) {
      R.id.linearCreditcard -> {
        val destIntent = LailyfaFebrinaCardActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "CREDIT_CARD_AND_DEBIT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CreditCardAndDebitActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
