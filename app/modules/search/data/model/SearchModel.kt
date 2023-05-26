package com.combodeals.app.modules.search.`data`.model

import com.combodeals.app.R
import com.combodeals.app.appcomponents.di.MyApp
import kotlin.String

data class SearchModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_nike_air_max_273)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchresult: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_vaporm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_max_273)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchresultOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_max_274)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchresultTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_vaporm2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchresultThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_max_97)

)
