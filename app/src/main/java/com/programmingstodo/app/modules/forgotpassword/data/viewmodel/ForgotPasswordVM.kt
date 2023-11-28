package com.programmingstodo.app.modules.forgotpassword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.programmingstodo.app.modules.forgotpassword.`data`.model.ForgotPasswordModel
import org.koin.core.KoinComponent

class ForgotPasswordVM : ViewModel(), KoinComponent {
  val forgotPasswordModel: MutableLiveData<ForgotPasswordModel> =
      MutableLiveData(ForgotPasswordModel())

  var navArguments: Bundle? = null
}
