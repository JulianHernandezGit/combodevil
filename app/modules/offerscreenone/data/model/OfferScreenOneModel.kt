package com.combodeals.app.modules.offerscreenone.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class OfferScreenOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOffer: String? = MyApp.getInstance().resources.getString(R.string.lbl_offer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOfferOne: String? = MyApp.getInstance().resources.getString(R.string.msg_use_megsl_cup)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOfferTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_super_flash_sal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHours: String? = MyApp.getInstance().resources.getString(R.string.lbl_08)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEleven: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMinutes: String? = MyApp.getInstance().resources.getString(R.string.lbl_34)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwelve: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSecounds: String? = MyApp.getInstance().resources.getString(R.string.lbl_52)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOfferThree: String? = MyApp.getInstance().resources.getString(R.string.msg_90_off_super_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubtitle: String? = MyApp.getInstance().resources.getString(R.string.msg_special_birthda)

)
