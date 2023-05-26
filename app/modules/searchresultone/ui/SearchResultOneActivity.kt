package com.combodeals.app.modules.searchresultone.ui

import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.combodeals.app.R
import com.combodeals.app.appcomponents.base.BaseActivity
import com.combodeals.app.databinding.ActivitySearchResultOneBinding
import com.combodeals.app.modules.searchresultone.`data`.viewmodel.SearchResultOneVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class SearchResultOneActivity :
    BaseActivity<ActivitySearchResultOneBinding>(R.layout.activity_search_result_one) {
  private val viewModel: SearchResultOneVM by viewModels<SearchResultOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.searchResultOneVM = viewModel
    setUpSearchViewSearchformListener()
  }

  override fun setUpClicks(): Unit {
  }

  private fun setUpSearchViewSearchformListener(): Unit {
    binding.searchViewSearchform.setOnQueryTextListener(object :
    SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "SEARCH_RESULT_ONE_ACTIVITY"

    }
  }
