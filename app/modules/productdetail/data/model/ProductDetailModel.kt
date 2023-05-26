package com.combodeals.app.modules.productdetail.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class ProductDetailModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNikeairmaxrea: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_max_272)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProductname: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_zoom_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_299_43)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectsize: String? = MyApp.getInstance().resources.getString(R.string.lbl_select_size)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectcolor: String? = MyApp.getInstance().resources.getString(R.string.lbl_select_color)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSpecification: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_specification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShown: String? = MyApp.getInstance().resources.getString(R.string.lbl_shown)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLaserblueanth: String? =
      MyApp.getInstance().resources.getString(R.string.msg_laser_blue_anth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStyle: String? = MyApp.getInstance().resources.getString(R.string.lbl_style)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStylecode: String? = MyApp.getInstance().resources.getString(R.string.lbl_cd0113_400)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_nike_air_ma)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewproduct: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_review_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeemorelink: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_more)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRattings: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewcount: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_review)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJameslawson: String? = MyApp.getInstance().resources.getString(R.string.lbl_james_lawson)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
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
  var txtYoumightalsolikOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_might_also)

)
