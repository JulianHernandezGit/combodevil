package com.combodeals.app.modules.explore.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.combodeals.app.R
import com.combodeals.app.appcomponents.base.BaseFragment
import com.combodeals.app.databinding.FragmentExploreBinding
import com.combodeals.app.modules.explore.`data`.model.Explore1RowModel
import com.combodeals.app.modules.explore.`data`.model.ExploreRowModel
import com.combodeals.app.modules.explore.`data`.viewmodel.ExploreVM
import com.combodeals.app.modules.notificationone.ui.NotificationOneActivity
import com.combodeals.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ExploreFragment : BaseFragment<FragmentExploreBinding>(R.layout.fragment_explore) {
  private val viewModel: ExploreVM by viewModels<ExploreVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val exploreAdapter = ExploreAdapter(viewModel.exploreList.value?:mutableListOf())
    binding.recyclerExplore.adapter = exploreAdapter
    exploreAdapter.setOnItemClickListener(
    object : ExploreAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ExploreRowModel) {
        onClickRecyclerExplore(view, position, item)
      }
    }
    )
    viewModel.exploreList.observe(requireActivity()) {
      exploreAdapter.updateData(it)
    }
    val explore1Adapter = Explore1Adapter(viewModel.explore1List.value?:mutableListOf())
    binding.recyclerExplore1.adapter = explore1Adapter
    explore1Adapter.setOnItemClickListener(
    object : Explore1Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Explore1RowModel) {
        onClickRecyclerExplore1(view, position, item)
      }
    }
    )
    viewModel.explore1List.observe(requireActivity()) {
      explore1Adapter.updateData(it)
    }
    binding.exploreVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageNotification.setOnClickListener {
      val destIntent = NotificationOneActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.searchViewSearch.setOnClickListener {
      val destIntent = SearchActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerExplore(
    view: View,
    position: Int,
    item: ExploreRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerExplore1(
    view: View,
    position: Int,
    item: Explore1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "EXPLORE_FRAGMENT"


    fun getInstance(bundle: Bundle?): ExploreFragment {
      val fragment = ExploreFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
