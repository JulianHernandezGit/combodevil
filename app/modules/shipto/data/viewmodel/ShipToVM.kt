package com.combodeals.app.modules.shipto.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.combodeals.app.modules.shipto.`data`.model.ShipToModel
import com.combodeals.app.modules.shipto.`data`.model.ToRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ShipToVM : ViewModel(), KoinComponent {
  val shipToModel: MutableLiveData<ShipToModel> = MutableLiveData(ShipToModel())

  var navArguments: Bundle? = null

  val shipToList: MutableLiveData<MutableList<ToRowModel>> = MutableLiveData(mutableListOf())
}
