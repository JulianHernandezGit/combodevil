package com.combodeals.app.modules.changepassword.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class ChangePasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChangepassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_change_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOldpassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_old_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewpassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewpasswordagaiOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_new_password_ag)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etOldpasswordOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etNewpasswordOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etNewpasswordagaiTwoValue: String? = null
)
