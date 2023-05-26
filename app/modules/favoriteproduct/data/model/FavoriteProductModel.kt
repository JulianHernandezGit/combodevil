package com.combodeals.app.modules.favoriteproduct.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class FavoriteProductModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFavoriteproductOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_favorite_produc)

)
