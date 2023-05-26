package com.combodeals.app.modules.favoriteproduct.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.combodeals.app.modules.favoriteproduct.`data`.model.FavoriteProductModel
import com.combodeals.app.modules.favoriteproduct.`data`.model.GridnikeairmaxreactRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FavoriteProductVM : ViewModel(), KoinComponent {
  val favoriteProductModel: MutableLiveData<FavoriteProductModel> =
      MutableLiveData(FavoriteProductModel())

  var navArguments: Bundle? = null

  val gridnikeairmaxreactList: MutableLiveData<MutableList<GridnikeairmaxreactRowModel>> =
      MutableLiveData(mutableListOf())
}
