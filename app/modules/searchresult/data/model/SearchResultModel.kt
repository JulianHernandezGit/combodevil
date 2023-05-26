package com.combodeals.app.modules.searchresult.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class SearchResultModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtResultCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_145_result)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtManshoes: String? = MyApp.getInstance().resources.getString(R.string.lbl_man_shoes)

)
