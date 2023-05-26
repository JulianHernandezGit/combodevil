package com.combodevil.app.ui


import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat.startActivity
import com.combodevil.app.data.model.RegisterFormVM
import com.combodevil.app.appcomponents.base.BaseActivity
import com.combodevil.app.databinding.ActivityRegisterFormBinding
import com.combodevil.app.extensions.NoInternetConnection
import com.combodevil.app.extensions.isJSONObject
import com.combodevil.app.extensions.showProgressDialog
import com.combodevil.app.modules.dashboardcontainer.ui.DashboardContainerActivity
import com.combodevil.app.network.models.createregister.CreateRegisterResponse
import com.combodevil.app.network.resources.ErrorResponse
import com.combodevil.app.network.resources.SuccessResponse
import com.combodevil.app.R
import com.google.android.material.snackbar.Snackbar
import org.json.JSONObject
import retrofit2.HttpException

class RegisterFormActivity :
	BaseActivity<ActivityRegisterFormBinding>(R.layout.activity_register_form) {
	private val viewModel: RegisterFormVM by viewModels<RegisterFormVM>()

	override fun onInitialized(): Unit {
		viewModel.navArguments = intent.extras?.getBundle("bundle")
		binding.registerFormVM = viewModel
	}

	override fun setUpClicks(): Unit {
	}

	override fun addObservers(): Unit {
		var progressDialog : AlertDialog? = null
		viewModel.progressLiveData.observe(this@RegisterFormActivity) {
			if(it) {
				progressDialog?.dismiss()
				progressDialog = null
				progressDialog = this@RegisterFormActivity.showProgressDialog()
			} else {
				progressDialog?.dismiss()
			}
		}
		viewModel.createRegisterLiveData.observe(this@RegisterFormActivity) {
			if(it is SuccessResponse) {
				val response = it.getContentIfNotHandled()
				onSuccessCreateRegister(it)
			} else if(it is ErrorResponse) {
				onErrorCreateRegister(it.data ?:Exception())
			}
		}
	}

	private fun onSuccessCreateRegister(response: SuccessResponse<CreateRegisterResponse>): Unit {
		viewModel.bindCreateRegisterResponse(response.data)
		val destBundle = Bundle()
		destBundle.putString("token", viewModel.createLoginLiveData.value?.getSuccessResponse()?.data?.token)
		destBundle.putString("id", viewModel.createLoginLiveData.value?.getSuccessResponse()?.data?.id)
		val destIntent = DashboardContainerActivity.getIntent(this, destBundle)
		startActivity(destIntent)
		finish()
	}

	private fun onErrorCreateRegister(exception: Exception): Unit {
		when(exception) {
			is NoInternetConnection -> {
				Snackbar.make(binding.root, exception.message?:"", Snackbar.LENGTH_LONG).show()
			}
			is HttpException -> {
				val errorBody = exception.response()?.errorBody()?.string()
				val errorObject = if (errorBody != null  && errorBody.isJSONObject()) JSONObject(errorBody)
				else JSONObject()
				val errMessage = if(!errorObject.optString("message").isNullOrEmpty()) {
					errorObject.optString("message").toString()
				} else {
					exception.response()?.message()?:""
				}
				Toast.makeText(this@RegisterFormActivity,errMessage,Toast.LENGTH_LONG).show()
			}
		}
	}

	companion object {
		const val TAG: String = "REGISTER_FORM_ACTIVITY"


		fun getIntent(context: Context, bundle: Bundle?): Intent {
			val destIntent = Intent(context, RegisterFormActivity::class.java)
			destIntent.putExtra("bundle", bundle)
			return destIntent
		}
	}
}
