package com.combodeals.app.modules.notification.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.combodeals.app.modules.notification.`data`.model.NotificationModel
import com.combodeals.app.modules.notification.`data`.model.NotificationRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NotificationVM : ViewModel(), KoinComponent {
  val notificationModel: MutableLiveData<NotificationModel> = MutableLiveData(NotificationModel())

  var navArguments: Bundle? = null

  val notificationList: MutableLiveData<MutableList<NotificationRowModel>> =
      MutableLiveData(mutableListOf())
}
