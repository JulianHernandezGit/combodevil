package com.combodeals.app.modules.creditcardanddebit.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class CreditCardAndDebitModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCreditcardand: String? =
      MyApp.getInstance().resources.getString(R.string.msg_credit_card_and)

)
