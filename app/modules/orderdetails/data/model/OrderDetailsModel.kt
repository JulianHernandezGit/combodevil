package com.combodeals.app.modules.orderdetails.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class OrderDetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOrderdetails: String? = MyApp.getInstance().resources.getString(R.string.lbl_order_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPacking: String? = MyApp.getInstance().resources.getString(R.string.lbl_packing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShippingOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArrivingOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_arriving)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSuccess: String? = MyApp.getInstance().resources.getString(R.string.lbl_success)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProduct: String? = MyApp.getInstance().resources.getString(R.string.lbl_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShippingdetailsOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_shipping_detail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateshipping: String? = MyApp.getInstance().resources.getString(R.string.lbl_date_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMonth: String? = MyApp.getInstance().resources.getString(R.string.msg_january_16_202)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShippingTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPosreggular: String? = MyApp.getInstance().resources.getString(R.string.lbl_pos_reggular)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNoresi: String? = MyApp.getInstance().resources.getString(R.string.lbl_no_resi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResinumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_000192848573)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_2727_new_owerr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentdetails: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItems: String? = MyApp.getInstance().resources.getString(R.string.lbl_items_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_598_86)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShippingThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_shipping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_40_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImportcharges: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_import_charges)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_128_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalprice: String? = MyApp.getInstance().resources.getString(R.string.lbl_total_price)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_766_86)

)
