package com.combodeals.app.modules.registerform.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class RegisterFormModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsgetstartedOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_get_start)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateannewaccoOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_an_new_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_have_an_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFullnameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etYouremailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordagainValue: String? = null
)
