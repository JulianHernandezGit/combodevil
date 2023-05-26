package com.combodeals.app.modules.orderdetails.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class DetailsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNikeairzoompegaOne: String? =
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
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)

)
