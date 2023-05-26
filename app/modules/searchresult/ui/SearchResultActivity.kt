package com.combodeals.app.modules.searchresult.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.combodeals.app.R
import com.combodeals.app.appcomponents.base.BaseActivity
import com.combodeals.app.databinding.ActivitySearchResultBinding
import com.combodeals.app.modules.filter.ui.FilterActivity
import com.combodeals.app.modules.search.ui.SearchActivity
import com.combodeals.app.modules.searchresult.`data`.model.ResultRowModel
import com.combodeals.app.modules.searchresult.`data`.viewmodel.SearchResultVM
import com.combodeals.app.modules.sortby.ui.SortByActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SearchResultActivity :
    BaseActivity<ActivitySearchResultBinding>(R.layout.activity_search_result) {
  private val viewModel: SearchResultVM by viewModels<SearchResultVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val searchResultAdapter =
    SearchResultAdapter(viewModel.searchResultList.value?:mutableListOf())
    binding.recyclerSearchResult.adapter = searchResultAdapter
    searchResultAdapter.setOnItemClickListener(
    object : SearchResultAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ResultRowModel) {
        onClickRecyclerSearchResult(view, position, item)
      }
    }
    )
    viewModel.searchResultList.observe(this) {
      searchResultAdapter.updateData(it)
    }
    binding.searchResultVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageFilter.setOnClickListener {
      val destIntent = FilterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageSort.setOnClickListener {
      val destIntent = SortByActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.searchViewSearch.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerSearchResult(
    view: View,
    position: Int,
    item: ResultRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SEARCH_RESULT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SearchResultActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
