package com.combodeals.app.modules.successscreen.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class SuccessScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSuccess: String? = MyApp.getInstance().resources.getString(R.string.lbl_success)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThankyouforshopOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_thank_you_for_s)

)
