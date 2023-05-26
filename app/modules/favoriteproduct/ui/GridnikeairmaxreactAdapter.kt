package com.combodeals.app.modules.favoriteproduct.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.combodeals.app.R
import com.combodeals.app.databinding.RowGridnikeairmaxreactBinding
import com.combodeals.app.modules.favoriteproduct.`data`.model.GridnikeairmaxreactRowModel
import kotlin.Int
import kotlin.collections.List

class GridnikeairmaxreactAdapter(
  var list: List<GridnikeairmaxreactRowModel>
) : RecyclerView.Adapter<GridnikeairmaxreactAdapter.RowGridnikeairmaxreactVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridnikeairmaxreactVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridnikeairmaxreact,parent,false)
    return RowGridnikeairmaxreactVH(view)
  }

  override fun onBindViewHolder(holder: RowGridnikeairmaxreactVH, position: Int) {
    val gridnikeairmaxreactRowModel = GridnikeairmaxreactRowModel()
    // TODO uncomment following line after integration with data source
    // val gridnikeairmaxreactRowModel = list[position]
    holder.binding.gridnikeairmaxreactRowModel = gridnikeairmaxreactRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridnikeairmaxreactRowModel>) {
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
      item: GridnikeairmaxreactRowModel
    ) {
    }
  }

  inner class RowGridnikeairmaxreactVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridnikeairmaxreactBinding = RowGridnikeairmaxreactBinding.bind(itemView)
    init {
      binding.linearProduct.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, GridnikeairmaxreactRowModel())
      }
    }
  }
}
