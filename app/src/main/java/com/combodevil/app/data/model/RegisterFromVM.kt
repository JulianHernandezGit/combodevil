package com.combodevil.app.data.model

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import appcomponents.utility.PreferenceHelper
import app.constants.role
import com.combodevil.app.network.models.createregister.CreateRegisterRequest
import com.combodevil.app.network.models.createregister.CreateRegisterResponse
import com.combodevil.app.network.repository.NetworkRepository
import com.combodevil.app.network.resources.Response
import org.koin.core.KoinComponent
import org.koin.core.inject
import kotlinx.coroutines.launch as coroutinesLaunch

/**
 *
 */
class RegisterFormVM : ViewModel(), KoinComponent {
	/**
	 *
	 */
	val registerFormModel: MutableLiveData<RegisterFormModel> = MutableLiveData(RegisterFormModel())


	/**
	 *
	 */
	var navArguments: Bundle? = null


	/**
	 *
	 */
	val progressLiveData: MutableLiveData<Boolean> = MutableLiveData<Boolean>()

	private val networkRepository: NetworkRepository by inject()

	/**
	 *
	 */
	val createRegisterLiveData: MutableLiveData<Response<CreateRegisterResponse>> =
		MutableLiveData<Response<CreateRegisterResponse>>()

	private val prefs: PreferenceHelper by inject()

	/**
	 *
	 */
	fun callCreateRegisterApi() {
		viewModelScope.coroutinesLaunch {
			progressLiveData.postValue(true)
			createRegisterLiveData.postValue(
				networkRepository.createRegister(
					createRegisterRequest = CreateRegisterRequest(
						password = registerFormModel.value?.etPasswordValue,
						role = role.USER,
						name = registerFormModel.value?.etFullnameValue,
						email = registerFormModel.value?.etYouremailValue,
						username = registerFormModel.value?.etYouremailValue
					)
				)
			)
		}
	}

	/**
	 *
	 */
	fun bindCreateRegisterResponse(response: CreateRegisterResponse) {
		val registerFormModelValue = registerFormModel.value ?:RegisterFormModel()
		this.prefs.setId(response.data?.id)
		registerFormModel.value = registerFormModelValue
		this.registerFormModel.value = registerFormModelValue}
