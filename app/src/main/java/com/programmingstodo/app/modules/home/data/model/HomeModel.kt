package com.programmingstodo.app.modules.home.`data`.model

import com.programmingstodo.app.R
import com.programmingstodo.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAdalah: String? = MyApp.getInstance().resources.getString(R.string.lbl_adalah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlcanasatre: String? = MyApp.getInstance().resources.getString(R.string.lbl_alcanasatre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? =
      MyApp.getInstance().resources.getString(R.string.msg_joined_6_month_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPersonality: String? = MyApp.getInstance().resources.getString(R.string.lbl_personality)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWorkTodayS: String? = MyApp.getInstance().resources.getString(R.string.lbl_work_today_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSetting: String? = MyApp.getInstance().resources.getString(R.string.lbl_setting)

)
