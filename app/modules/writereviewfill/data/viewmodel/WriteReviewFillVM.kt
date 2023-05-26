package com.combodeals.app.modules.writereviewfill.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.combodeals.app.modules.writereviewfill.`data`.model.WriteReviewFillModel
import org.koin.core.KoinComponent

class WriteReviewFillVM : ViewModel(), KoinComponent {
  val writeReviewFillModel: MutableLiveData<WriteReviewFillModel> =
      MutableLiveData(WriteReviewFillModel())

  var navArguments: Bundle? = null
}
