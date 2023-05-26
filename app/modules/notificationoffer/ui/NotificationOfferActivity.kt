package com.combodeals.app.modules.notificationoffer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.combodeals.app.R
import com.combodeals.app.appcomponents.base.BaseActivity
import com.combodeals.app.databinding.ActivityNotificationOfferBinding
import com.combodeals.app.modules.notificationoffer.`data`.model.ListofferRowModel
import com.combodeals.app.modules.notificationoffer.`data`.viewmodel.NotificationOfferVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NotificationOfferActivity :
    BaseActivity<ActivityNotificationOfferBinding>(R.layout.activity_notification_offer) {
  private val viewModel: NotificationOfferVM by viewModels<NotificationOfferVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listofferAdapter = ListofferAdapter(viewModel.listofferList.value?:mutableListOf())
    binding.recyclerListoffer.adapter = listofferAdapter
    listofferAdapter.setOnItemClickListener(
    object : ListofferAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListofferRowModel) {
        onClickRecyclerListoffer(view, position, item)
      }
    }
    )
    viewModel.listofferList.observe(this) {
      listofferAdapter.updateData(it)
    }
    binding.notificationOfferVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListoffer(
    view: View,
    position: Int,
    item: ListofferRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATION_OFFER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationOfferActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
