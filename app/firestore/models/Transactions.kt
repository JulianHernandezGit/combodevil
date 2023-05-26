package com.combodeals.app.firestore.models

import com.google.firebase.Timestamp
import com.google.firebase.firestore.PropertyName
import kotlin.Int
import kotlin.jvm.JvmField

public class Transactions {
  @JvmField
  @PropertyName("userID")
  public var userID: Int? = null

  @JvmField
  @PropertyName("packageID")
  public var packageID: Int? = null

  @JvmField
  @PropertyName("date")
  public var date: Timestamp? = null

  @JvmField
  @PropertyName("price")
  public var price: Int? = null
}
