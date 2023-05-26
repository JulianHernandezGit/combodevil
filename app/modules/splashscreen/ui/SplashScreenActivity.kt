package com.combodeals.app.modules.splashscreen.ui

import android.content.Intent
import androidx.activity.viewModels
import com.combodeals.app.R
import com.combodeals.app.appcomponents.base.BaseActivity
import com.combodeals.app.databinding.ActivitySplashScreenBinding
import com.combodeals.app.modules.login.ui.LoginActivity
import com.combodeals.app.modules.splashscreen.`data`.viewmodel.SplashScreenVM
import kotlin.String
import kotlin.Unit

class SplashScreenActivity :
    BaseActivity<ActivitySplashScreenBinding>(R.layout.activity_splash_screen) {
  private val viewModel: SplashScreenVM by viewModels<SplashScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashScreenVM = viewModel
    val destIntent = LoginActivity.getIntent(this, null)
    destIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
    startActivity(destIntent)
    finish()
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SPLASH_SCREEN_ACTIVITY"

  }
}
