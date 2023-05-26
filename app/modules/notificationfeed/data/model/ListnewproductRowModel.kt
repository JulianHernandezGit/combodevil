package com.combodeals.app.modules.notificationfeed.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class ListnewproductRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNewproduct: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_product)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNikeairzoompegaOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_zoom_p2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_june_3_2015_5)

)
