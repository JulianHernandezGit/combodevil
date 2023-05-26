package com.combodeals.app.modules.choosecreditordebitcard.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.viewModels
import com.combodeals.app.R
import com.combodeals.app.appcomponents.base.BaseActivity
import com.combodeals.app.databinding.ActivityChooseCreditOrDebitCardBinding
import com.combodeals.app.modules.choosecreditordebitcard.`data`.model.ImageSliderSlidervolumeModel
import com.combodeals.app.modules.choosecreditordebitcard.`data`.viewmodel.ChooseCreditOrDebitCardVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class ChooseCreditOrDebitCardActivity :
    BaseActivity<ActivityChooseCreditOrDebitCardBinding>(R.layout.activity_choose_credit_or_debit_card)
    {
  private val imageUri: Uri = Uri.parse("android.resource://com.combodeals.app/drawable/img_volume")


  private val imageSliderSlidervolumeItems: ArrayList<ImageSliderSlidervolumeModel> =
      arrayListOf(ImageSliderSlidervolumeModel(imageVolume =
  imageUri.toString()),ImageSliderSlidervolumeModel(imageVolume = imageUri.toString()))


  private val viewModel: ChooseCreditOrDebitCardVM by viewModels<ChooseCreditOrDebitCardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val slidervolumeAdapter = SlidervolumeAdapter(imageSliderSlidervolumeItems,true)
    binding.imageSliderSlidervolume.adapter = slidervolumeAdapter
    binding.imageSliderSlidervolume.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorClock.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorClock.updateIndicatorCounts(binding.imageSliderSlidervolume.indicatorCount)
    binding.chooseCreditOrDebitCardVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSlidervolume.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSlidervolume.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CHOOSE_CREDIT_OR_DEBIT_CARD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChooseCreditOrDebitCardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
