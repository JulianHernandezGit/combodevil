package com.combodeals.app.modules.successscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.combodeals.app.modules.successscreen.`data`.model.SuccessScreenModel
import org.koin.core.KoinComponent

class SuccessScreenVM : ViewModel(), KoinComponent {
  val successScreenModel: MutableLiveData<SuccessScreenModel> =
      MutableLiveData(SuccessScreenModel())

  var navArguments: Bundle? = null
}
