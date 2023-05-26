package com.combodeals.app.modules.notification.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.combodeals.app.R
import com.combodeals.app.databinding.RowNotificationBinding
import com.combodeals.app.modules.notification.`data`.model.NotificationRowModel
import kotlin.Int
import kotlin.collections.List

class NotificationAdapter(
  var list: List<NotificationRowModel>
) : RecyclerView.Adapter<NotificationAdapter.RowNotificationVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowNotificationVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_notification,parent,false)
    return RowNotificationVH(view)
  }

  override fun onBindViewHolder(holder: RowNotificationVH, position: Int) {
    val notificationRowModel = NotificationRowModel()
    // TODO uncomment following line after integration with data source
    // val notificationRowModel = list[position]
    holder.binding.notificationRowModel = notificationRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<NotificationRowModel>) {
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
      item: NotificationRowModel
    ) {
    }
  }

  inner class RowNotificationVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowNotificationBinding = RowNotificationBinding.bind(itemView)
  }
}
