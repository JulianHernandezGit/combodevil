package com.combodeals.app.modules.offerscreenone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.combodeals.app.modules.offerscreenone.`data`.model.OfferScreenOneModel
import org.koin.core.KoinComponent

class OfferScreenOneVM : ViewModel(), KoinComponent {
  val offerScreenOneModel: MutableLiveData<OfferScreenOneModel> =
      MutableLiveData(OfferScreenOneModel())

  var navArguments: Bundle? = null
}
