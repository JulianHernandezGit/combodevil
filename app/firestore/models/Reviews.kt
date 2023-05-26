package com.combodeals.app.firestore.models

import com.google.firebase.firestore.PropertyName
import kotlin.Int
import kotlin.String
import kotlin.jvm.JvmField

public class Reviews {
  @JvmField
  @PropertyName("userID")
  public var userID: Int? = null

  @JvmField
  @PropertyName("packageID")
  public var packageID: Int? = null

  @JvmField
  @PropertyName("rating")
  public var rating: Int? = null

  @JvmField
  @PropertyName("reviewText")
  public var reviewText: String? = null
}
