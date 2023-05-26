package com.combodeals.app.firestore.models

import com.google.firebase.firestore.PropertyName
import kotlin.String
import kotlin.jvm.JvmField

public class Packages {
  @JvmField
  @PropertyName("description")
  public var description: String? = null
}
