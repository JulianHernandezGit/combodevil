package com.combodeals.app.modules.order.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class OrderRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_sdg1345kjd)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrderatecom: String? = MyApp.getInstance().resources.getString(R.string.msg_order_at_e_com)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrderstatus: String? = MyApp.getInstance().resources.getString(R.string.lbl_order_status)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShipping: String? = MyApp.getInstance().resources.getString(R.string.lbl_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItems: String? = MyApp.getInstance().resources.getString(R.string.lbl_items)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPurchasedcount: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1_items_purchas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_price)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_299_43)

)
