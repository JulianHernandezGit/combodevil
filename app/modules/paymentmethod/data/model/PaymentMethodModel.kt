package com.combodeals.app.modules.paymentmethod.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class PaymentMethodModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPayment: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreditcardordebOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_credit_card_or)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaypal: String? = MyApp.getInstance().resources.getString(R.string.lbl_paypal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBanktransfer: String? = MyApp.getInstance().resources.getString(R.string.lbl_bank_transfer)

)
