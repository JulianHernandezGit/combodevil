package com.combodeals.app.modules.filter.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.combodeals.app.modules.filter.`data`.model.FilterModel
import org.koin.core.KoinComponent

class FilterVM : ViewModel(), KoinComponent {
  val filterModel: MutableLiveData<FilterModel> = MutableLiveData(FilterModel())

  var navArguments: Bundle? = null
}
