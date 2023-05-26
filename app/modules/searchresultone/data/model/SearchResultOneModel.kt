package com.combodeals.app.modules.searchresultone.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class SearchResultOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtResultCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_result)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtManshoes: String? = MyApp.getInstance().resources.getString(R.string.lbl_man_shoes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProductnotfoundOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_product_not_fou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThankyouforshopOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_thank_you_for_s)

)
