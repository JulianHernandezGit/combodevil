package com.combodeals.app.modules.offerscreen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.combodeals.app.R
import com.combodeals.app.databinding.RowScreenBinding
import com.combodeals.app.modules.offerscreen.`data`.model.ScreenRowModel
import kotlin.Int
import kotlin.collections.List

class OfferScreenAdapter(
  var list: List<ScreenRowModel>
) : RecyclerView.Adapter<OfferScreenAdapter.RowScreenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowScreenVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_screen,parent,false)
    return RowScreenVH(view)
  }

  override fun onBindViewHolder(holder: RowScreenVH, position: Int) {
    val screenRowModel = ScreenRowModel()
    // TODO uncomment following line after integration with data source
    // val screenRowModel = list[position]
    holder.binding.screenRowModel = screenRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ScreenRowModel>) {
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
      item: ScreenRowModel
    ) {
    }
  }

  inner class RowScreenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowScreenBinding = RowScreenBinding.bind(itemView)
    init {
      binding.linearProduct.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ScreenRowModel())
      }
    }
  }
}
