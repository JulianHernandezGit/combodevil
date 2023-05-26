package com.combodeals.app.modules.addcard.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class AddCardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddcard: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardnumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExpirationdate: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_expiration_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSecuritycode: String? = MyApp.getInstance().resources.getString(R.string.lbl_security_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardholder: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_holder2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEntercardnumberOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etExpirationdateOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etSecuritycodeOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEntercardnumberThreeValue: String? = null
)
