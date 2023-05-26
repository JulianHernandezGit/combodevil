package com.combodeals.app.modules.notificationone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.combodeals.app.modules.notificationone.`data`.model.NotificationOneModel
import org.koin.core.KoinComponent

class NotificationOneVM : ViewModel(), KoinComponent {
  val notificationOneModel: MutableLiveData<NotificationOneModel> =
      MutableLiveData(NotificationOneModel())

  var navArguments: Bundle? = null
}
