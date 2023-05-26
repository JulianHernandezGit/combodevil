package com.combodeals.app.modules.writereviewfill.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class WriteReviewFillModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWritereview: String? = MyApp.getInstance().resources.getString(R.string.lbl_write_review)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPleasewriteoverOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_write_ov)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWriteyourreviewOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_write_your_revi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etAddreviewValue: String? = null
)
