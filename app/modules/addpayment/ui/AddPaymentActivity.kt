package com.combodeals.app.modules.addpayment.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.combodeals.app.R
import com.combodeals.app.appcomponents.base.BaseActivity
import com.combodeals.app.databinding.ActivityAddPaymentBinding
import com.combodeals.app.modules.addpayment.`data`.viewmodel.AddPaymentVM
import com.combodeals.app.modules.creditcardanddebit.ui.CreditCardAndDebitActivity
import kotlin.String
import kotlin.Unit

class AddPaymentActivity : BaseActivity<ActivityAddPaymentBinding>(R.layout.activity_add_payment) {
  private val viewModel: AddPaymentVM by viewModels<AddPaymentVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addPaymentVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowmobile.setOnClickListener {
      val destIntent = CreditCardAndDebitActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "ADD_PAYMENT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddPaymentActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
