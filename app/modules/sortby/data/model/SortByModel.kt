package com.combodeals.app.modules.sortby.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class SortByModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSortby: String? = MyApp.getInstance().resources.getString(R.string.lbl_sort_by)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBestmatch: String? = MyApp.getInstance().resources.getString(R.string.lbl_best_match)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeendingsooneOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_time_ending_so)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimenewlylistedOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_time_newly_lis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceshipping: String? =
      MyApp.getInstance().resources.getString(R.string.msg_price_shippin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceshippingOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_price_shippin2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistancenearestOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_distance_neare)

)
