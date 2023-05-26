package com.combodeals.app.modules.favoriteproduct.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.combodeals.app.R
import com.combodeals.app.appcomponents.base.BaseActivity
import com.combodeals.app.databinding.ActivityFavoriteProductBinding
import com.combodeals.app.modules.favoriteproduct.`data`.model.GridnikeairmaxreactRowModel
import com.combodeals.app.modules.favoriteproduct.`data`.viewmodel.FavoriteProductVM
import com.combodeals.app.modules.productdetail.ui.ProductDetailActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FavoriteProductActivity :
    BaseActivity<ActivityFavoriteProductBinding>(R.layout.activity_favorite_product) {
  private val viewModel: FavoriteProductVM by viewModels<FavoriteProductVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridnikeairmaxreactAdapter =
    GridnikeairmaxreactAdapter(viewModel.gridnikeairmaxreactList.value?:mutableListOf())
    binding.recyclerGridnikeairmaxreact.adapter = gridnikeairmaxreactAdapter
    gridnikeairmaxreactAdapter.setOnItemClickListener(
    object : GridnikeairmaxreactAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridnikeairmaxreactRowModel) {
        onClickRecyclerGridnikeairmaxreact(view, position, item)
      }
    }
    )
    viewModel.gridnikeairmaxreactList.observe(this) {
      gridnikeairmaxreactAdapter.updateData(it)
    }
    binding.favoriteProductVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerGridnikeairmaxreact(
    view: View,
    position: Int,
    item: GridnikeairmaxreactRowModel
  ): Unit {
    when(view.id) {
      R.id.linearProduct ->  {
        val destIntent = ProductDetailActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "FAVORITE_PRODUCT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FavoriteProductActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
