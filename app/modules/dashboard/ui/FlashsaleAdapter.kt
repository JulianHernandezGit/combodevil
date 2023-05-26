package com.combodeals.app.modules.dashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.combodeals.app.R
import com.combodeals.app.databinding.RowFlashsaleBinding
import com.combodeals.app.modules.dashboard.`data`.model.FlashsaleRowModel
import kotlin.Int
import kotlin.collections.List

class FlashsaleAdapter(
  var list: List<FlashsaleRowModel>
) : RecyclerView.Adapter<FlashsaleAdapter.RowFlashsaleVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFlashsaleVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_flashsale,parent,false)
    return RowFlashsaleVH(view)
  }

  override fun onBindViewHolder(holder: RowFlashsaleVH, position: Int) {
    val flashsaleRowModel = FlashsaleRowModel()
    // TODO uncomment following line after integration with data source
    // val flashsaleRowModel = list[position]
    holder.binding.flashsaleRowModel = flashsaleRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<FlashsaleRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: FlashsaleRowModel
    ) {
    }
  }

  inner class RowFlashsaleVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowFlashsaleBinding = RowFlashsaleBinding.bind(itemView)
    init {
      binding.linearProduct.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, FlashsaleRowModel())
      }
    }
  }
}
