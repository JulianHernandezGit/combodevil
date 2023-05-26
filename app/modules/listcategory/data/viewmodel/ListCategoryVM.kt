package com.combodeals.app.modules.listcategory.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.combodeals.app.modules.listcategory.`data`.model.ListCategoryModel
import org.koin.core.KoinComponent

class ListCategoryVM : ViewModel(), KoinComponent {
  val listCategoryModel: MutableLiveData<ListCategoryModel> = MutableLiveData(ListCategoryModel())

  var navArguments: Bundle? = null
}
