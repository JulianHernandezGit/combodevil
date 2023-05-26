package com.combodeals.app.modules.searchresult.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.combodeals.app.modules.searchresult.`data`.model.ResultRowModel
import com.combodeals.app.modules.searchresult.`data`.model.SearchResultModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SearchResultVM : ViewModel(), KoinComponent {
  val searchResultModel: MutableLiveData<SearchResultModel> = MutableLiveData(SearchResultModel())

  var navArguments: Bundle? = null

  val searchResultList: MutableLiveData<MutableList<ResultRowModel>> =
      MutableLiveData(mutableListOf())
}
