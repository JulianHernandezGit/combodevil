package com.combodeals.app.modules.dashboard.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class CategoriesRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtManshirt: String? = MyApp.getInstance().resources.getString(R.string.lbl_man_shirt)

)
