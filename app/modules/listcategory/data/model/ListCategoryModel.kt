package com.combodeals.app.modules.listcategory.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class ListCategoryModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_category)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShirt: String? = MyApp.getInstance().resources.getString(R.string.lbl_shirt)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBikini: String? = MyApp.getInstance().resources.getString(R.string.lbl_bikini)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDress: String? = MyApp.getInstance().resources.getString(R.string.lbl_dress)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWorkequipment: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_work_equipment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtManpants: String? = MyApp.getInstance().resources.getString(R.string.lbl_man_pants)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtManshoes: String? = MyApp.getInstance().resources.getString(R.string.lbl_man_shoes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtManunderwear: String? = MyApp.getInstance().resources.getString(R.string.lbl_man_underwear)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMantshirt: String? = MyApp.getInstance().resources.getString(R.string.lbl_man_t_shirt)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWomanbag: String? = MyApp.getInstance().resources.getString(R.string.lbl_woman_bag)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWomanpants: String? = MyApp.getInstance().resources.getString(R.string.lbl_woman_pants)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHighheels: String? = MyApp.getInstance().resources.getString(R.string.lbl_high_heels)

)
