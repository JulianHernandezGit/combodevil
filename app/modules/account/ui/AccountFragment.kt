package com.combodeals.app.modules.account.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.combodeals.app.R
import com.combodeals.app.appcomponents.base.BaseFragment
import com.combodeals.app.databinding.FragmentAccountBinding
import com.combodeals.app.modules.account.`data`.viewmodel.AccountVM
import com.combodeals.app.modules.addpayment.ui.AddPaymentActivity
import com.combodeals.app.modules.notificationone.ui.NotificationOneActivity
import com.combodeals.app.modules.profile.ui.ProfileActivity
import kotlin.String
import kotlin.Unit

class AccountFragment : BaseFragment<FragmentAccountBinding>(R.layout.fragment_account) {
  private val viewModel: AccountVM by viewModels<AccountVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.accountVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageNotification.setOnClickListener {
      val destIntent = NotificationOneActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.linearUser.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.linearPayment.setOnClickListener {
      val destIntent = AddPaymentActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "ACCOUNT_FRAGMENT"


    fun getInstance(bundle: Bundle?): AccountFragment {
      val fragment = AccountFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
