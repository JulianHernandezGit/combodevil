package com.combodeals.app.modules.addaddress.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class AddAddressModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddaddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountryorregionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_country_or_regi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFirstname: String? = MyApp.getInstance().resources.getString(R.string.lbl_first_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLastname: String? = MyApp.getInstance().resources.getString(R.string.lbl_last_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStreetaddress: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_street_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStreetaddressTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_street_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCity: String? = MyApp.getInstance().resources.getString(R.string.lbl_city)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStateprovincereOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_state_province)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_zip_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhonenumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_phone_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etOldpasswordValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etOldpasswordOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etOldpasswordTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etOldpasswordThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etOldpasswordFourValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etOldpasswordFiveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etOldpasswordSixValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etOldpasswordSevenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etOldpasswordEightValue: String? = null
)
