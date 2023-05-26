package com.combodeals.app.modules.notification.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactionnikeOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_transaction_nik)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_culpa_cillum_co)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_april_30_2014)

)
