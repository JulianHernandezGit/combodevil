package com.combodeals.app.modules.profile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.combodeals.app.modules.profile.`data`.model.ProfileModel
import com.combodeals.app.network.models.fetchme.FetchMeResponse
import com.combodeals.app.network.repository.NetworkRepository
import com.combodeals.app.network.resources.Response
import kotlin.Boolean
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

class ProfileVM : ViewModel(), KoinComponent {
  val profileModel: MutableLiveData<ProfileModel> = MutableLiveData(ProfileModel())


  var navArguments: Bundle? = null


  val progressLiveData: MutableLiveData<Boolean> = MutableLiveData<Boolean>()

  private val networkRepository: NetworkRepository by inject()

  val fetchMeLiveData: MutableLiveData<Response<FetchMeResponse>> =
      MutableLiveData<Response<FetchMeResponse>>()

  fun callFetchMeApi() {
    viewModelScope.launch {
      progressLiveData.postValue(true)
      fetchMeLiveData.postValue(
      networkRepository.fetchMe()
      )
      progressLiveData.postValue(false)
    }
  }

  fun bindFetchMeResponse(response: FetchMeResponse) {
    val profileModelValue = profileModel.value ?:ProfileModel()
    profileModelValue.txtUsername = response.data?.username.toString()
    profileModelValue.txtEmailOne = response.data?.email.toString()
    profileModelValue.txtName = response.data?.name.toString()
    profileModel.value = profileModelValue
  }
}
