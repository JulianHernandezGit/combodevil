package com.combodeals.app.modules.choosecreditordebitcard.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.combodeals.app.databinding.SlideritemChooseCreditOrDebitCard1Binding
import com.combodeals.app.modules.choosecreditordebitcard.`data`.model.ImageSliderSlidervolumeModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SlidervolumeAdapter(
  val dataList: ArrayList<ImageSliderSlidervolumeModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSlidervolumeModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemChooseCreditOrDebitCard1Binding) {
      binding.imageSliderSlidervolumeModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemChooseCreditOrDebitCard1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
