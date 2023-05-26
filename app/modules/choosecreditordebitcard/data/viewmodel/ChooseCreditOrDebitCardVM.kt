package com.combodeals.app.modules.choosecreditordebitcard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.combodeals.app.modules.choosecreditordebitcard.`data`.model.ChooseCreditOrDebitCardModel
import org.koin.core.KoinComponent

class ChooseCreditOrDebitCardVM : ViewModel(), KoinComponent {
  val chooseCreditOrDebitCardModel: MutableLiveData<ChooseCreditOrDebitCardModel> =
      MutableLiveData(ChooseCreditOrDebitCardModel())

  var navArguments: Bundle? = null
}
