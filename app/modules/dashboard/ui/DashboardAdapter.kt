package com.combodeals.app.modules.dashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.combodeals.app.R
import com.combodeals.app.databinding.RowDashboardBinding
import com.combodeals.app.modules.dashboard.`data`.model.DashboardRowModel
import kotlin.Int
import kotlin.collections.List

class DashboardAdapter(
  var list: List<DashboardRowModel>
) : RecyclerView.Adapter<DashboardAdapter.RowDashboardVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDashboardVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_dashboard,parent,false)
    return RowDashboardVH(view)
  }

  override fun onBindViewHolder(holder: RowDashboardVH, position: Int) {
    val dashboardRowModel = DashboardRowModel()
    // TODO uncomment following line after integration with data source
    // val dashboardRowModel = list[position]
    holder.binding.dashboardRowModel = dashboardRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<DashboardRowModel>) {
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
      item: DashboardRowModel
    ) {
    }
  }

  inner class RowDashboardVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowDashboardBinding = RowDashboardBinding.bind(itemView)
  }
}
