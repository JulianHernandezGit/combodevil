package com.combodeals.app.modules.addaddress.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.combodeals.app.modules.addaddress.`data`.model.AddAddressModel
import org.koin.core.KoinComponent

class AddAddressVM : ViewModel(), KoinComponent {
  val addAddressModel: MutableLiveData<AddAddressModel> = MutableLiveData(AddAddressModel())

  var navArguments: Bundle? = null
}
