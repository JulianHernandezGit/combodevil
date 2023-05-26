package com.combodeals.app.modules.productdetail.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.combodeals.app.R
import com.combodeals.app.appcomponents.base.BaseActivity
import com.combodeals.app.databinding.ActivityProductDetailBinding
import com.combodeals.app.modules.productdetail.`data`.model.ImageSliderSliderModel
import com.combodeals.app.modules.productdetail.`data`.model.RecomendedRowModel
import com.combodeals.app.modules.productdetail.`data`.model.SizesRowModel
import com.combodeals.app.modules.productdetail.`data`.viewmodel.ProductDetailVM
import com.combodeals.app.modules.reviewproduct.ui.ReviewProductActivity
import com.combodeals.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class ProductDetailActivity :
    BaseActivity<ActivityProductDetailBinding>(R.layout.activity_product_detail) {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.combodeals.app/drawable/img_productimage_1")


  private val imageSliderSliderItems: ArrayList<ImageSliderSliderModel> =
      arrayListOf(ImageSliderSliderModel(imageProductimage =
  imageUri.toString()),ImageSliderSliderModel(imageProductimage = imageUri.toString()))


  private val viewModel: ProductDetailVM by viewModels<ProductDetailVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sliderAdapter = SliderAdapter(imageSliderSliderItems,true)
    binding.imageSliderSlider.adapter = sliderAdapter
    binding.imageSliderSlider.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorClock.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorClock.updateIndicatorCounts(binding.imageSliderSlider.indicatorCount)
    val sizesAdapter = SizesAdapter(viewModel.sizesList.value?:mutableListOf())
    binding.recyclerSizes.adapter = sizesAdapter
    sizesAdapter.setOnItemClickListener(
    object : SizesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SizesRowModel) {
        onClickRecyclerSizes(view, position, item)
      }
    }
    )
    viewModel.sizesList.observe(this) {
      sizesAdapter.updateData(it)
    }
    val recomendedAdapter = RecomendedAdapter(viewModel.recomendedList.value?:mutableListOf())
    binding.recyclerRecomended.adapter = recomendedAdapter
    recomendedAdapter.setOnItemClickListener(
    object : RecomendedAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : RecomendedRowModel) {
        onClickRecyclerRecomended(view, position, item)
      }
    }
    )
    viewModel.recomendedList.observe(this) {
      recomendedAdapter.updateData(it)
    }
    binding.productDetailVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSlider.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSlider.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.txtSeemorelink.setOnClickListener {
      val destIntent = ReviewProductActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageSearch.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerSizes(
    view: View,
    position: Int,
    item: SizesRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerRecomended(
    view: View,
    position: Int,
    item: RecomendedRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PRODUCT_DETAIL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProductDetailActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
