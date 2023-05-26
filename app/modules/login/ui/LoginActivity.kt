package com.combodeals.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import com.combodeals.app.R
import com.combodeals.app.appcomponents.base.BaseActivity
import com.combodeals.app.appcomponents.di.MyApp
import com.combodeals.app.appcomponents.facebookauth.FacebookHelper
import com.combodeals.app.appcomponents.googleauth.GoogleHelper
import com.combodeals.app.databinding.ActivityLoginBinding
import com.combodeals.app.extensions.NoInternetConnection
import com.combodeals.app.extensions.isJSONObject
import com.combodeals.app.extensions.showProgressDialog
import com.combodeals.app.modules.dashboardcontainer.ui.DashboardContainerActivity
import com.combodeals.app.modules.login.`data`.viewmodel.LoginVM
import com.combodeals.app.modules.registerform.ui.RegisterFormActivity
import com.combodeals.app.network.models.createlogin.CreateLoginResponse
import com.combodeals.app.network.resources.ErrorResponse
import com.combodeals.app.network.resources.SuccessResponse
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.google.android.material.snackbar.Snackbar
import com.google.gson.Gson
import java.lang.Exception
import kotlin.Int
import kotlin.String
import kotlin.Unit
import org.json.JSONObject
import retrofit2.HttpException

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()

  private val facebookLogin: FacebookHelper = FacebookHelper()

  private lateinit var googleLogin: GoogleHelper

  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ) {
    callbackManager.onActivityResult(requestCode, resultCode, data)
    super.onActivityResult(requestCode,resultCode,data)
  }

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.linearRowgoogle.setOnClickListener {
        googleLogin.login()
      }
      binding.linearRowfacebook.setOnClickListener {
        LoginManager.getInstance().logInWithReadPermissions(this, listOf("public_profile"))
        facebookLogin.login(callbackManager,object : FacebookCallback<LoginResult> {
          override fun onSuccess(result: LoginResult?) {
          }
          override fun onError(error: FacebookException?) {
          }
          override fun onCancel() {
          }
          })
        }
        binding.txtConfirmation.setOnClickListener {
          val destIntent = RegisterFormActivity.getIntent(this, null)
          startActivity(destIntent)
        }
      }

      override fun addObservers() {
        var progressDialog : AlertDialog? = null
        viewModel.progressLiveData.observe(this@LoginActivity) {
          if(it) {
            progressDialog?.dismiss()
            progressDialog = null
            progressDialog = this@LoginActivity.showProgressDialog()
          } else  {
            progressDialog?.dismiss()
          }
        }
        viewModel.createLoginLiveData.observe(this@LoginActivity) {
          if(it is SuccessResponse) {
            val response = it.getContentIfNotHandled()
            onSuccessCreateLogin(it)
          } else if(it is ErrorResponse)  {
            onErrorCreateLogin(it.data ?:Exception())
          }
        }
      }

      private fun onSuccessCreateLogin(response: SuccessResponse<CreateLoginResponse>) {
        viewModel.bindCreateLoginResponse(response.data)
        val destBundle = Bundle()
        destBundle.putString("token",Gson().toJson(viewModel.createLoginLiveData.value?.getSuccessResponse()?.))
        destBundle.putString("id",Gson().toJson(viewModel.createLoginLiveData.value?.getSuccessResponse()?.))
        val destIntent = DashboardContainerActivity.getIntent(this, destBundle)
        startActivity(destIntent)
        finish()
      }

      private fun onErrorCreateLogin(exception: Exception) {
        when(exception) {
          is NoInternetConnection -> {
            Snackbar.make(binding.root, exception.message?:"", Snackbar.LENGTH_LONG).show()
          }
          is HttpException -> {
            val errorBody = exception.response()?.errorBody()?.string()
            val errorObject = if (errorBody != null  && errorBody.isJSONObject())
                JSONObject(errorBody) else JSONObject()
            Toast.makeText(this@LoginActivity,MyApp.getInstance().getString(R.string.msg_invalid_username_or_pa),Toast.LENGTH_LONG).show()
          }
        }
      }

      companion object {
        const val TAG: String = "LOGIN_ACTIVITY"


        fun getIntent(context: Context, bundle: Bundle?): Intent {
          val destIntent = Intent(context, LoginActivity::class.java)
          destIntent.putExtra("bundle", bundle)
          return destIntent
        }
      }
    }
