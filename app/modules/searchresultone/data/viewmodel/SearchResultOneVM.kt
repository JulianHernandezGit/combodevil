package com.combodeals.app.modules.searchresultone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.combodeals.app.modules.searchresultone.`data`.model.SearchResultOneModel
import org.koin.core.KoinComponent

class SearchResultOneVM : ViewModel(), KoinComponent {
  val searchResultOneModel: MutableLiveData<SearchResultOneModel> =
      MutableLiveData(SearchResultOneModel())

  var navArguments: Bundle? = null
}
