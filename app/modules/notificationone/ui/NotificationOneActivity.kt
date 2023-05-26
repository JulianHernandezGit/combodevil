package com.combodeals.app.modules.notificationone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.combodeals.app.R
import com.combodeals.app.appcomponents.base.BaseActivity
import com.combodeals.app.databinding.ActivityNotificationOneBinding
import com.combodeals.app.modules.notification.ui.NotificationActivity
import com.combodeals.app.modules.notificationfeed.ui.NotificationFeedActivity
import com.combodeals.app.modules.notificationoffer.ui.NotificationOfferActivity
import com.combodeals.app.modules.notificationone.`data`.viewmodel.NotificationOneVM
import kotlin.String
import kotlin.Unit

class NotificationOneActivity :
    BaseActivity<ActivityNotificationOneBinding>(R.layout.activity_notification_one) {
  private val viewModel: NotificationOneVM by viewModels<NotificationOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.notificationOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearFeed.setOnClickListener {
      val destIntent = NotificationFeedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearOffer.setOnClickListener {
      val destIntent = NotificationOfferActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearActivity.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATION_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
