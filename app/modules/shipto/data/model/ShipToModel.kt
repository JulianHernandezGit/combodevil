package com.combodeals.app.modules.shipto.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class ShipToModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtShipto: String? = MyApp.getInstance().resources.getString(R.string.lbl_ship_to)

)
