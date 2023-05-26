package com.combodeals.app.modules.reviewproduct.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.combodeals.app.R
import com.combodeals.app.appcomponents.base.BaseActivity
import com.combodeals.app.databinding.ActivityReviewProductBinding
import com.combodeals.app.modules.reviewproduct.`data`.viewmodel.ReviewProductVM
import com.combodeals.app.modules.writereviewfill.ui.WriteReviewFillActivity
import kotlin.String
import kotlin.Unit

class ReviewProductActivity :
    BaseActivity<ActivityReviewProductBinding>(R.layout.activity_review_product) {
  private val viewModel: ReviewProductVM by viewModels<ReviewProductVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.reviewProductVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnWriteReview.setOnClickListener {
      val destIntent = WriteReviewFillActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "REVIEW_PRODUCT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ReviewProductActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
