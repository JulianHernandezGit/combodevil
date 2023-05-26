package com.combodeals.app.firestore.models

import com.google.firebase.firestore.PropertyName
import kotlin.String
import kotlin.jvm.JvmField

public class Users {
  @JvmField
  @PropertyName("name")
  public var name: String? = null
}
