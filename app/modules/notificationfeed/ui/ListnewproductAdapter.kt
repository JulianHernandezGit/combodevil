package com.combodeals.app.modules.notificationfeed.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.combodeals.app.R
import com.combodeals.app.databinding.RowListnewproductBinding
import com.combodeals.app.modules.notificationfeed.`data`.model.ListnewproductRowModel
import kotlin.Int
import kotlin.collections.List

class ListnewproductAdapter(
  var list: List<ListnewproductRowModel>
) : RecyclerView.Adapter<ListnewproductAdapter.RowListnewproductVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListnewproductVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listnewproduct,parent,false)
    return RowListnewproductVH(view)
  }

  override fun onBindViewHolder(holder: RowListnewproductVH, position: Int) {
    val listnewproductRowModel = ListnewproductRowModel()
    // TODO uncomment following line after integration with data source
    // val listnewproductRowModel = list[position]
    holder.binding.listnewproductRowModel = listnewproductRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListnewproductRowModel>) {
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
      item: ListnewproductRowModel
    ) {
    }
  }

  inner class RowListnewproductVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListnewproductBinding = RowListnewproductBinding.bind(itemView)
  }
}
