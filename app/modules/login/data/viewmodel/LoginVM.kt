package com.combodeals.app.modules.login.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.combodeals.app.appcomponents.utility.PreferenceHelper
import com.combodeals.app.modules.login.`data`.model.LoginModel
import com.combodeals.app.network.models.createlogin.CreateLoginRequest
import com.combodeals.app.network.models.createlogin.CreateLoginResponse
import com.combodeals.app.network.repository.NetworkRepository
import com.combodeals.app.network.resources.Response
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import kotlin.Boolean
import kotlin.Unit
import kotlinx.coroutines.launch
import org.json.JSONObject
import org.koin.core.KoinComponent
import org.koin.core.inject

class LoginVM : ViewModel(), KoinComponent {
  val loginModel: MutableLiveData<LoginModel> = MutableLiveData(LoginModel())


  var navArguments: Bundle? = null


  val progressLiveData: MutableLiveData<Boolean> = MutableLiveData<Boolean>()


  private val networkRepository: NetworkRepository by inject()

  val createLoginLiveData: MutableLiveData<Response<CreateLoginResponse>> =
      MutableLiveData<Response<CreateLoginResponse>>()


  private val prefs: PreferenceHelper by inject()

  var facebookAuthResponse: JSONObject = JSONObject()


  lateinit var googleAuthResponse: GoogleSignInAccount

  fun callCreateLoginApi(): Unit {
    viewModelScope.launch {
      progressLiveData.postValue(true)
      createLoginLiveData.postValue(
      networkRepository.createLogin(
      createLoginRequest = CreateLoginRequest(
      password = loginModel.value?.etPasswordValue,
      username = loginModel.value?.etEmailValue)
      )
      )
      progressLiveData.postValue(false)
    }
  }

  fun bindCreateLoginResponse(response: CreateLoginResponse): Unit {
    val loginModelValue = loginModel.value ?:LoginModel()
    prefs.setToken(response.data?.token)
    loginModel.value = loginModelValue
  }
}
