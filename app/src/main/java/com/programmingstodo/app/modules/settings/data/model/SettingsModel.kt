package com.programmingstodo.app.modules.settings.`data`.model

import com.programmingstodo.app.R
import com.programmingstodo.app.appcomponents.di.MyApp
import kotlin.String

data class SettingsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourSettingsSo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_settings_so)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPersonality: String? = MyApp.getInstance().resources.getString(R.string.lbl_personality)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_language)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTermAndCondition: String? =
      MyApp.getInstance().resources.getString(R.string.msg_terms_and_conditions)

)
