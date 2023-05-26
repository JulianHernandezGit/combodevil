package com.combodeals.app.modules.address.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.combodeals.app.R
import com.combodeals.app.databinding.RowAddressBinding
import com.combodeals.app.modules.address.`data`.model.AddressRowModel
import kotlin.Int
import kotlin.collections.List

class AddressAdapter(
  var list: List<AddressRowModel>
) : RecyclerView.Adapter<AddressAdapter.RowAddressVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowAddressVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_address,parent,false)
    return RowAddressVH(view)
  }

  override fun onBindViewHolder(holder: RowAddressVH, position: Int) {
    val addressRowModel = AddressRowModel()
    // TODO uncomment following line after integration with data source
    // val addressRowModel = list[position]
    holder.binding.addressRowModel = addressRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<AddressRowModel>) {
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
      item: AddressRowModel
    ) {
    }
  }

  inner class RowAddressVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowAddressBinding = RowAddressBinding.bind(itemView)
  }
}
