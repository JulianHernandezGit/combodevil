package com.combodeals.app.modules.shipto.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.combodeals.app.R
import com.combodeals.app.databinding.RowToBinding
import com.combodeals.app.modules.shipto.`data`.model.ToRowModel
import kotlin.Int
import kotlin.collections.List

class ShipToAdapter(
  var list: List<ToRowModel>
) : RecyclerView.Adapter<ShipToAdapter.RowToVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowToVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_to,parent,false)
    return RowToVH(view)
  }

  override fun onBindViewHolder(holder: RowToVH, position: Int) {
    val toRowModel = ToRowModel()
    // TODO uncomment following line after integration with data source
    // val toRowModel = list[position]
    holder.binding.toRowModel = toRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ToRowModel>) {
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
      item: ToRowModel
    ) {
    }
  }

  inner class RowToVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowToBinding = RowToBinding.bind(itemView)
  }
}
