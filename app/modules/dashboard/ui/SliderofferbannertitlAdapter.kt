package com.combodeals.app.modules.dashboard.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.combodeals.app.databinding.SlideritemDashboard1Binding
import com.combodeals.app.modules.dashboard.`data`.model.ImageSliderSliderofferbannertitlModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderofferbannertitlAdapter(
  val dataList: ArrayList<ImageSliderSliderofferbannertitlModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderofferbannertitlModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemDashboard1Binding) {
      binding.imageSliderSliderofferbannertitlModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemDashboard1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
