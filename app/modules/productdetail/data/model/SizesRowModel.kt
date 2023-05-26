package com.combodeals.app.modules.productdetail.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class SizesRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_6)

)
