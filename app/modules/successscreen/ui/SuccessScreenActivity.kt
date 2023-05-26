package com.combodeals.app.modules.successscreen.ui

import androidx.activity.viewModels
import com.combodeals.app.R
import com.combodeals.app.appcomponents.base.BaseActivity
import com.combodeals.app.databinding.ActivitySuccessScreenBinding
import com.combodeals.app.modules.order.ui.OrderActivity
import com.combodeals.app.modules.successscreen.`data`.viewmodel.SuccessScreenVM
import kotlin.String
import kotlin.Unit

class SuccessScreenActivity :
    BaseActivity<ActivitySuccessScreenBinding>(R.layout.activity_success_screen) {
  private val viewModel: SuccessScreenVM by viewModels<SuccessScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.successScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBackToOrder.setOnClickListener {
      val destIntent = OrderActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SUCCESS_SCREEN_ACTIVITY"

  }
}
