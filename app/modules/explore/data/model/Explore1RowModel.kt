package com.combodeals.app.modules.explore.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class Explore1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDress: String? = MyApp.getInstance().resources.getString(R.string.lbl_dress)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWomantshirt: String? = MyApp.getInstance().resources.getString(R.string.lbl_woman_t_shirt)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWomanpants: String? = MyApp.getInstance().resources.getString(R.string.lbl_woman_pants)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSkirt: String? = MyApp.getInstance().resources.getString(R.string.lbl_skirt)

)
