package com.combodeals.app.modules.productdetail.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.combodeals.app.R
import com.combodeals.app.databinding.RowSizesBinding
import com.combodeals.app.modules.productdetail.`data`.model.SizesRowModel
import kotlin.Int
import kotlin.collections.List

class SizesAdapter(
  var list: List<SizesRowModel>
) : RecyclerView.Adapter<SizesAdapter.RowSizesVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSizesVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_sizes,parent,false)
    return RowSizesVH(view)
  }

  override fun onBindViewHolder(holder: RowSizesVH, position: Int) {
    val sizesRowModel = SizesRowModel()
    // TODO uncomment following line after integration with data source
    // val sizesRowModel = list[position]
    holder.binding.sizesRowModel = sizesRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SizesRowModel>) {
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
      item: SizesRowModel
    ) {
    }
  }

  inner class RowSizesVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSizesBinding = RowSizesBinding.bind(itemView)
  }
}
