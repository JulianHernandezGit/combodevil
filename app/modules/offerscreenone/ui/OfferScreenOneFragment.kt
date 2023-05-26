package com.combodeals.app.modules.offerscreenone.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.combodeals.app.R
import com.combodeals.app.appcomponents.base.BaseFragment
import com.combodeals.app.databinding.FragmentOfferScreenOneBinding
import com.combodeals.app.modules.notificationone.ui.NotificationOneActivity
import com.combodeals.app.modules.offerscreenone.`data`.viewmodel.OfferScreenOneVM
import kotlin.String
import kotlin.Unit

class OfferScreenOneFragment :
    BaseFragment<FragmentOfferScreenOneBinding>(R.layout.fragment_offer_screen_one) {
  private val viewModel: OfferScreenOneVM by viewModels<OfferScreenOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.offerScreenOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageNotification.setOnClickListener {
      val destIntent = NotificationOneActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "OFFER_SCREEN_ONE_FRAGMENT"


    fun getInstance(bundle: Bundle?): OfferScreenOneFragment {
      val fragment = OfferScreenOneFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
