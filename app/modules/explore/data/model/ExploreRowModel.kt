package com.combodeals.app.modules.explore.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class ExploreRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtManshirt: String? = MyApp.getInstance().resources.getString(R.string.lbl_man_shirt)

)
