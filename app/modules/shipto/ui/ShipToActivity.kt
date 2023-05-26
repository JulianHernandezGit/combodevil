package com.combodeals.app.modules.shipto.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.combodeals.app.R
import com.combodeals.app.appcomponents.base.BaseActivity
import com.combodeals.app.databinding.ActivityShipToBinding
import com.combodeals.app.modules.paymentmethod.ui.PaymentMethodActivity
import com.combodeals.app.modules.shipto.`data`.model.ToRowModel
import com.combodeals.app.modules.shipto.`data`.viewmodel.ShipToVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ShipToActivity : BaseActivity<ActivityShipToBinding>(R.layout.activity_ship_to) {
  private val viewModel: ShipToVM by viewModels<ShipToVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val shipToAdapter = ShipToAdapter(viewModel.shipToList.value?:mutableListOf())
    binding.recyclerShipTo.adapter = shipToAdapter
    shipToAdapter.setOnItemClickListener(
    object : ShipToAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ToRowModel) {
        onClickRecyclerShipTo(view, position, item)
      }
    }
    )
    viewModel.shipToList.observe(this) {
      shipToAdapter.updateData(it)
    }
    binding.shipToVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnNext.setOnClickListener {
      val destIntent = PaymentMethodActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerShipTo(
    view: View,
    position: Int,
    item: ToRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SHIP_TO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ShipToActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
