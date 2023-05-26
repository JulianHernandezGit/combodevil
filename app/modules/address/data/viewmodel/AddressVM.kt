package com.combodeals.app.modules.address.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.combodeals.app.modules.address.`data`.model.AddressModel
import com.combodeals.app.modules.address.`data`.model.AddressRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AddressVM : ViewModel(), KoinComponent {
  val addressModel: MutableLiveData<AddressModel> = MutableLiveData(AddressModel())

  var navArguments: Bundle? = null

  val addressList: MutableLiveData<MutableList<AddressRowModel>> = MutableLiveData(mutableListOf())
}
