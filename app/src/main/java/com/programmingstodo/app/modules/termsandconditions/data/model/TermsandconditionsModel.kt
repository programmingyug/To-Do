package com.programmingstodo.app.modules.termsandconditions.`data`.model

import com.programmingstodo.app.R
import com.programmingstodo.app.appcomponents.di.MyApp
import kotlin.String

data class TermsandconditionsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTermAndCondition: String? =
      MyApp.getInstance().resources.getString(R.string.msg_terms_and_conditions)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dolor2)

)
