package com.combodeals.app.modules.offerscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.combodeals.app.modules.offerscreen.`data`.model.OfferScreenModel
import com.combodeals.app.modules.offerscreen.`data`.model.ScreenRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class OfferScreenVM : ViewModel(), KoinComponent {
  val offerScreenModel: MutableLiveData<OfferScreenModel> = MutableLiveData(OfferScreenModel())

  var navArguments: Bundle? = null

  val offerScreenList: MutableLiveData<MutableList<ScreenRowModel>> =
      MutableLiveData(mutableListOf())
}
