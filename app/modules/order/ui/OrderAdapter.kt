package com.combodeals.app.modules.order.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.combodeals.app.R
import com.combodeals.app.databinding.RowOrderBinding
import com.combodeals.app.modules.order.`data`.model.OrderRowModel
import kotlin.Int
import kotlin.collections.List

class OrderAdapter(
  var list: List<OrderRowModel>
) : RecyclerView.Adapter<OrderAdapter.RowOrderVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowOrderVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_order,parent,false)
    return RowOrderVH(view)
  }

  override fun onBindViewHolder(holder: RowOrderVH, position: Int) {
    val orderRowModel = OrderRowModel()
    // TODO uncomment following line after integration with data source
    // val orderRowModel = list[position]
    holder.binding.orderRowModel = orderRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<OrderRowModel>) {
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
      item: OrderRowModel
    ) {
    }
  }

  inner class RowOrderVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowOrderBinding = RowOrderBinding.bind(itemView)
  }
}
