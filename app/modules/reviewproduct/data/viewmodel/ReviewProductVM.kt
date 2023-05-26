package com.combodeals.app.modules.reviewproduct.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.combodeals.app.modules.reviewproduct.`data`.model.ReviewProductModel
import org.koin.core.KoinComponent

class ReviewProductVM : ViewModel(), KoinComponent {
  val reviewProductModel: MutableLiveData<ReviewProductModel> =
      MutableLiveData(ReviewProductModel())

  var navArguments: Bundle? = null
}
