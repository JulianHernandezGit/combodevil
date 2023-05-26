package com.combodeals.app.modules.creditcardanddebit.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.combodeals.app.modules.creditcardanddebit.`data`.model.CreditCardAndDebitModel
import com.combodeals.app.modules.creditcardanddebit.`data`.model.ListvolumeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CreditCardAndDebitVM : ViewModel(), KoinComponent {
  val creditCardAndDebitModel: MutableLiveData<CreditCardAndDebitModel> =
      MutableLiveData(CreditCardAndDebitModel())

  var navArguments: Bundle? = null

  val listvolumeList: MutableLiveData<MutableList<ListvolumeRowModel>> =
      MutableLiveData(mutableListOf())
}
