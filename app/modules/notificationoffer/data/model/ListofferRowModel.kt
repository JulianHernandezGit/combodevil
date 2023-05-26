package com.combodeals.app.modules.notificationoffer.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class ListofferRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtThebesttitle: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_the_best_title)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_culpa_cillum_co)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_april_30_2014)

)
