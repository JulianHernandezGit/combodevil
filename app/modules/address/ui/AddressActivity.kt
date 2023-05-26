package com.combodeals.app.modules.address.ui

import android.view.View
import androidx.activity.viewModels
import com.combodeals.app.R
import com.combodeals.app.appcomponents.base.BaseActivity
import com.combodeals.app.databinding.ActivityAddressBinding
import com.combodeals.app.modules.address.`data`.model.AddressRowModel
import com.combodeals.app.modules.address.`data`.viewmodel.AddressVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AddressActivity : BaseActivity<ActivityAddressBinding>(R.layout.activity_address) {
  private val viewModel: AddressVM by viewModels<AddressVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val addressAdapter = AddressAdapter(viewModel.addressList.value?:mutableListOf())
    binding.recyclerAddress.adapter = addressAdapter
    addressAdapter.setOnItemClickListener(
    object : AddressAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : AddressRowModel) {
        onClickRecyclerAddress(view, position, item)
      }
    }
    )
    viewModel.addressList.observe(this) {
      addressAdapter.updateData(it)
    }
    binding.addressVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerAddress(
    view: View,
    position: Int,
    item: AddressRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ADDRESS_ACTIVITY"

  }
}
