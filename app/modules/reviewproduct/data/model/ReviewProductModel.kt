package com.combodeals.app.modules.reviewproduct.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class ReviewProductModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_review2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJameslawson: String? = MyApp.getInstance().resources.getString(R.string.lbl_james_lawson)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_air_max_are_alw)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.msg_december_10_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLauraoctavian: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_laura_octavian)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThisisreallyamaOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_this_is_really)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateOne: String? = MyApp.getInstance().resources.getString(R.string.msg_december_10_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJhonsonbridge: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_jhonson_bridge)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_air_max_are_alw2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_december_10_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLauraoctavianOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_laura_octavian)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThisisreallyamaThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_this_is_really)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateThree: String? = MyApp.getInstance().resources.getString(R.string.msg_december_10_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJhonsonbridgeOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_jhonson_bridge)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_air_max_are_alw2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateFour: String? = MyApp.getInstance().resources.getString(R.string.msg_december_10_20)

)
