package com.combodeals.app.modules.explore.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class ExploreModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtManfashion: String? = MyApp.getInstance().resources.getString(R.string.lbl_man_fashion)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWomanfashion: String? = MyApp.getInstance().resources.getString(R.string.lbl_woman_fashion)

)
