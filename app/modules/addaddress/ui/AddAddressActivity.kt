package com.combodeals.app.modules.addaddress.ui

import androidx.activity.viewModels
import com.combodeals.app.R
import com.combodeals.app.appcomponents.base.BaseActivity
import com.combodeals.app.databinding.ActivityAddAddressBinding
import com.combodeals.app.modules.addaddress.`data`.viewmodel.AddAddressVM
import kotlin.String
import kotlin.Unit

class AddAddressActivity : BaseActivity<ActivityAddAddressBinding>(R.layout.activity_add_address) {
  private val viewModel: AddAddressVM by viewModels<AddAddressVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addAddressVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "ADD_ADDRESS_ACTIVITY"

  }
}
