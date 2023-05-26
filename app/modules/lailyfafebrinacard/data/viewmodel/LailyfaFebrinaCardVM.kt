package com.combodeals.app.modules.lailyfafebrinacard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.combodeals.app.modules.lailyfafebrinacard.`data`.model.LailyfaFebrinaCardModel
import org.koin.core.KoinComponent

class LailyfaFebrinaCardVM : ViewModel(), KoinComponent {
  val lailyfaFebrinaCardModel: MutableLiveData<LailyfaFebrinaCardModel> =
      MutableLiveData(LailyfaFebrinaCardModel())

  var navArguments: Bundle? = null
}
