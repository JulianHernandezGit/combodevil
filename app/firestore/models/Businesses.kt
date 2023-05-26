package com.combodeals.app.firestore.models

import com.google.firebase.firestore.GeoPoint
import com.google.firebase.firestore.PropertyName
import kotlin.String
import kotlin.jvm.JvmField

public class Businesses {
  @JvmField
  @PropertyName("name")
  public var name: String? = null

  @JvmField
  @PropertyName("location")
  public var location: GeoPoint? = null

  @JvmField
  @PropertyName("activityTypes")
  public var activityTypes: String? = null
}
