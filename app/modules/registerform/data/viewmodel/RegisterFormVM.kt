package com.combodeals.app.modules.registerform.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.combodeals.app.appcomponents.utility.PreferenceHelper
import com.combodeals.app.constants.role
import com.combodeals.app.modules.registerform.`data`.model.RegisterFormModel
import com.combodeals.app.network.models.createregister.CreateRegisterRequest
import com.combodeals.app.network.models.createregister.CreateRegisterResponse
import com.combodeals.app.network.repository.NetworkRepository
import com.combodeals.app.network.resources.Response
import kotlin.Boolean
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

class RegisterFormVM : ViewModel(), KoinComponent {
  val registerFormModel: MutableLiveData<RegisterFormModel> = MutableLiveData(RegisterFormModel())


  var navArguments: Bundle? = null


  val progressLiveData: MutableLiveData<Boolean> = MutableLiveData<Boolean>()

  private val networkRepository: NetworkRepository by inject()

  val createRegisterLiveData: MutableLiveData<Response<CreateRegisterResponse>> =
      MutableLiveData<Response<CreateRegisterResponse>>()

  private val prefs: PreferenceHelper by inject()

  fun callCreateRegisterApi() {
    viewModelScope.launch {
      progressLiveData.postValue(true)
      createRegisterLiveData.postValue(
      networkRepository.createRegister(
      createRegisterRequest = CreateRegisterRequest(
          password = registerFormModel.value?.etPasswordValue,
          role = role.USER,
          name = registerFormModel.value?.etFullnameValue,
          email = registerFormModel.value?.etYouremailValue,
          username = registerFormModel.value?.etYouremailValue)
      )
      )
      progressLiveData.postValue(false)
    }
  }

  fun bindCreateRegisterResponse(response: CreateRegisterResponse) {
    val registerFormModelValue = registerFormModel.value ?:RegisterFormModel()
    prefs.setId(response.data?.id)
    registerFormModel.value = registerFormModelValue
  }
}
