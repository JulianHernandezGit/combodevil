package com.combodeals.app.modules.choosecreditordebitcard.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class ChooseCreditOrDebitCardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChoosecard: String? = MyApp.getInstance().resources.getString(R.string.lbl_choose_card)

)
