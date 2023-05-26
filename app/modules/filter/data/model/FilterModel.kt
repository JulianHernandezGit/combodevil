package com.combodeals.app.modules.filter.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class FilterModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFiltersearch: String? = MyApp.getInstance().resources.getString(R.string.lbl_filter_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPricerange: String? = MyApp.getInstance().resources.getString(R.string.lbl_price_range)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCondition: String? = MyApp.getInstance().resources.getString(R.string.lbl_condition)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNew: String? = MyApp.getInstance().resources.getString(R.string.lbl_new)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUsedselected: String? = MyApp.getInstance().resources.getString(R.string.lbl_used)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotspecifiedsel: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_not_specified)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBuyingformat: String? = MyApp.getInstance().resources.getString(R.string.lbl_buying_format)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItemlocation: String? = MyApp.getInstance().resources.getString(R.string.lbl_item_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShowonly: String? = MyApp.getInstance().resources.getString(R.string.lbl_show_only)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etPriceValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPriceOneValue: String? = null
)
