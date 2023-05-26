package com.combodeals.app.modules.notificationfeed.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.combodeals.app.modules.notificationfeed.`data`.model.ListnewproductRowModel
import com.combodeals.app.modules.notificationfeed.`data`.model.NotificationFeedModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NotificationFeedVM : ViewModel(), KoinComponent {
  val notificationFeedModel: MutableLiveData<NotificationFeedModel> =
      MutableLiveData(NotificationFeedModel())

  var navArguments: Bundle? = null

  val listnewproductList: MutableLiveData<MutableList<ListnewproductRowModel>> =
      MutableLiveData(mutableListOf())
}
