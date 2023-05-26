package com.combodeals.app.modules.notificationoffer.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.combodeals.app.R
import com.combodeals.app.databinding.RowListofferBinding
import com.combodeals.app.modules.notificationoffer.`data`.model.ListofferRowModel
import kotlin.Int
import kotlin.collections.List

class ListofferAdapter(
  var list: List<ListofferRowModel>
) : RecyclerView.Adapter<ListofferAdapter.RowListofferVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListofferVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listoffer,parent,false)
    return RowListofferVH(view)
  }

  override fun onBindViewHolder(holder: RowListofferVH, position: Int) {
    val listofferRowModel = ListofferRowModel()
    // TODO uncomment following line after integration with data source
    // val listofferRowModel = list[position]
    holder.binding.listofferRowModel = listofferRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListofferRowModel>) {
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
      item: ListofferRowModel
    ) {
    }
  }

  inner class RowListofferVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListofferBinding = RowListofferBinding.bind(itemView)
  }
}
