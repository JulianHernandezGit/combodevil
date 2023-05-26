package com.combodeals.app.modules.addpayment.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.combodeals.app.modules.addpayment.`data`.model.AddPaymentModel
import org.koin.core.KoinComponent

class AddPaymentVM : ViewModel(), KoinComponent {
  val addPaymentModel: MutableLiveData<AddPaymentModel> = MutableLiveData(AddPaymentModel())

  var navArguments: Bundle? = null
}
