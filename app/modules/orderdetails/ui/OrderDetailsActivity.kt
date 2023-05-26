package com.combodeals.app.modules.orderdetails.ui

import android.view.View
import androidx.activity.viewModels
import com.combodeals.app.R
import com.combodeals.app.appcomponents.base.BaseActivity
import com.combodeals.app.databinding.ActivityOrderDetailsBinding
import com.combodeals.app.modules.orderdetails.`data`.model.DetailsRowModel
import com.combodeals.app.modules.orderdetails.`data`.viewmodel.OrderDetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class OrderDetailsActivity :
    BaseActivity<ActivityOrderDetailsBinding>(R.layout.activity_order_details) {
  private val viewModel: OrderDetailsVM by viewModels<OrderDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val orderDetailsAdapter =
    OrderDetailsAdapter(viewModel.orderDetailsList.value?:mutableListOf())
    binding.recyclerOrderDetails.adapter = orderDetailsAdapter
    orderDetailsAdapter.setOnItemClickListener(
    object : OrderDetailsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DetailsRowModel) {
        onClickRecyclerOrderDetails(view, position, item)
      }
    }
    )
    viewModel.orderDetailsList.observe(this) {
      orderDetailsAdapter.updateData(it)
    }
    binding.orderDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerOrderDetails(
    view: View,
    position: Int,
    item: DetailsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ORDER_DETAILS_ACTIVITY"

  }
}
