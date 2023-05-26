package com.combodeals.app.modules.dashboard.ui

import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.combodeals.app.R
import com.combodeals.app.appcomponents.base.BaseFragment
import com.combodeals.app.databinding.FragmentDashboardBinding
import com.combodeals.app.modules.dashboard.`data`.model.CategoriesRowModel
import com.combodeals.app.modules.dashboard.`data`.model.DashboardRowModel
import com.combodeals.app.modules.dashboard.`data`.model.FlashsaleRowModel
import com.combodeals.app.modules.dashboard.`data`.model.ImageSliderSliderofferbannertitlModel
import com.combodeals.app.modules.dashboard.`data`.model.MegasaleRowModel
import com.combodeals.app.modules.dashboard.`data`.viewmodel.DashboardVM
import com.combodeals.app.modules.favoriteproduct.ui.FavoriteProductActivity
import com.combodeals.app.modules.listcategory.ui.ListCategoryActivity
import com.combodeals.app.modules.notificationone.ui.NotificationOneActivity
import com.combodeals.app.modules.offerscreen.ui.OfferScreenActivity
import com.combodeals.app.modules.productdetail.ui.ProductDetailActivity
import com.combodeals.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class DashboardFragment : BaseFragment<FragmentDashboardBinding>(R.layout.fragment_dashboard) {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.combodeals.app/drawable/img_promotionimage_206x343")


  private val imageSliderSliderofferbannertitlItems:
      ArrayList<ImageSliderSliderofferbannertitlModel> =
      arrayListOf(ImageSliderSliderofferbannertitlModel(imagePromotionimage =
  imageUri.toString()),ImageSliderSliderofferbannertitlModel(imagePromotionimage =
  imageUri.toString()))


  private val viewModel: DashboardVM by viewModels<DashboardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val sliderofferbannertitlAdapter =
    SliderofferbannertitlAdapter(imageSliderSliderofferbannertitlItems,true)
    binding.imageSliderSliderofferbannertitl.adapter = sliderofferbannertitlAdapter
    binding.imageSliderSliderofferbannertitl.onIndicatorProgress = { selectingPosition,
      progress ->
      binding.indicatorClock.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorClock.updateIndicatorCounts(binding.imageSliderSliderofferbannertitl.indicatorCount)
    val categoriesAdapter = CategoriesAdapter(viewModel.categoriesList.value?:mutableListOf())
    binding.recyclerCategories.adapter = categoriesAdapter
    categoriesAdapter.setOnItemClickListener(
    object : CategoriesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CategoriesRowModel) {
        onClickRecyclerCategories(view, position, item)
      }
    }
    )
    viewModel.categoriesList.observe(requireActivity()) {
      categoriesAdapter.updateData(it)
    }
    val flashsaleAdapter = FlashsaleAdapter(viewModel.flashsaleList.value?:mutableListOf())
    binding.recyclerFlashsale.adapter = flashsaleAdapter
    flashsaleAdapter.setOnItemClickListener(
    object : FlashsaleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : FlashsaleRowModel) {
        onClickRecyclerFlashsale(view, position, item)
      }
    }
    )
    viewModel.flashsaleList.observe(requireActivity()) {
      flashsaleAdapter.updateData(it)
    }
    val megasaleAdapter = MegasaleAdapter(viewModel.megasaleList.value?:mutableListOf())
    binding.recyclerMegasale.adapter = megasaleAdapter
    megasaleAdapter.setOnItemClickListener(
    object : MegasaleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MegasaleRowModel) {
        onClickRecyclerMegasale(view, position, item)
      }
    }
    )
    viewModel.megasaleList.observe(requireActivity()) {
      megasaleAdapter.updateData(it)
    }
    val dashboardAdapter = DashboardAdapter(viewModel.dashboardList.value?:mutableListOf())
    binding.recyclerDashboard.adapter = dashboardAdapter
    dashboardAdapter.setOnItemClickListener(
    object : DashboardAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DashboardRowModel) {
        onClickRecyclerDashboard(view, position, item)
      }
    }
    )
    viewModel.dashboardList.observe(requireActivity()) {
      dashboardAdapter.updateData(it)
    }
    binding.dashboardVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSliderofferbannertitl.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSliderofferbannertitl.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.imageNotification.setOnClickListener {
      val destIntent = NotificationOneActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.txtSearchproduct.setOnClickListener {
      val destIntent = SearchActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.txtMorecategorylin.setOnClickListener {
      val destIntent = ListCategoryActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.imageDownload.setOnClickListener {
      val destIntent = FavoriteProductActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.linearRowflashsale.setOnClickListener {
      val destIntent = OfferScreenActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerCategories(
    view: View,
    position: Int,
    item: CategoriesRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerFlashsale(
    view: View,
    position: Int,
    item: FlashsaleRowModel
  ): Unit {
    when(view.id) {
      R.id.linearProduct ->  {
        val destIntent = ProductDetailActivity.getIntent(requireActivity(), null)
        startActivity(destIntent)
        requireActivity().onBackPressed()
      }
    }
  }

  fun onClickRecyclerMegasale(
    view: View,
    position: Int,
    item: MegasaleRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerDashboard(
    view: View,
    position: Int,
    item: DashboardRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DASHBOARD_FRAGMENT"


    fun getInstance(bundle: Bundle?): DashboardFragment {
      val fragment = DashboardFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
