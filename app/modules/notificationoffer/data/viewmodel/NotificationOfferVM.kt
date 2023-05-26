package com.combodeals.app.modules.notificationoffer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.combodeals.app.modules.notificationoffer.`data`.model.ListofferRowModel
import com.combodeals.app.modules.notificationoffer.`data`.model.NotificationOfferModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NotificationOfferVM : ViewModel(), KoinComponent {
  val notificationOfferModel: MutableLiveData<NotificationOfferModel> =
      MutableLiveData(NotificationOfferModel())

  var navArguments: Bundle? = null

  val listofferList: MutableLiveData<MutableList<ListofferRowModel>> =
      MutableLiveData(mutableListOf())
}
