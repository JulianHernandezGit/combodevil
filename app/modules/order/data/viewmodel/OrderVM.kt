package com.combodeals.app.modules.order.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.combodeals.app.modules.order.`data`.model.OrderModel
import com.combodeals.app.modules.order.`data`.model.OrderRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class OrderVM : ViewModel(), KoinComponent {
  val orderModel: MutableLiveData<OrderModel> = MutableLiveData(OrderModel())

  var navArguments: Bundle? = null

  val orderList: MutableLiveData<MutableList<OrderRowModel>> = MutableLiveData(mutableListOf())
}
