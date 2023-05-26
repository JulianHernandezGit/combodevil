package com.combodeals.app.modules.order.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.combodeals.app.R
import com.combodeals.app.appcomponents.base.BaseActivity
import com.combodeals.app.databinding.ActivityOrderBinding
import com.combodeals.app.modules.order.`data`.model.OrderRowModel
import com.combodeals.app.modules.order.`data`.viewmodel.OrderVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class OrderActivity : BaseActivity<ActivityOrderBinding>(R.layout.activity_order) {
  private val viewModel: OrderVM by viewModels<OrderVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val orderAdapter = OrderAdapter(viewModel.orderList.value?:mutableListOf())
    binding.recyclerOrder.adapter = orderAdapter
    orderAdapter.setOnItemClickListener(
    object : OrderAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : OrderRowModel) {
        onClickRecyclerOrder(view, position, item)
      }
    }
    )
    viewModel.orderList.observe(this) {
      orderAdapter.updateData(it)
    }
    binding.orderVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerOrder(
    view: View,
    position: Int,
    item: OrderRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ORDER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OrderActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
