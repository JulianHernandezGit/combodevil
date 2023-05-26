package com.combodeals.app.modules.cart.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.combodeals.app.R
import com.combodeals.app.appcomponents.base.BaseFragment
import com.combodeals.app.databinding.FragmentCartBinding
import com.combodeals.app.modules.cart.`data`.model.CartRowModel
import com.combodeals.app.modules.cart.`data`.viewmodel.CartVM
import com.combodeals.app.modules.notificationone.ui.NotificationOneActivity
import com.combodeals.app.modules.shipto.ui.ShipToActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CartFragment : BaseFragment<FragmentCartBinding>(R.layout.fragment_cart) {
  private val viewModel: CartVM by viewModels<CartVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val cartAdapter = CartAdapter(viewModel.cartList.value?:mutableListOf())
    binding.recyclerCart.adapter = cartAdapter
    cartAdapter.setOnItemClickListener(
    object : CartAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CartRowModel) {
        onClickRecyclerCart(view, position, item)
      }
    }
    )
    viewModel.cartList.observe(requireActivity()) {
      cartAdapter.updateData(it)
    }
    binding.cartVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageNotification.setOnClickListener {
      val destIntent = NotificationOneActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.btnCheckOut.setOnClickListener {
      val destIntent = ShipToActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerCart(
    view: View,
    position: Int,
    item: CartRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CART_FRAGMENT"


    fun getInstance(bundle: Bundle?): CartFragment {
      val fragment = CartFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
