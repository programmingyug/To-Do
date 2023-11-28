package com.programmingstodo.app.modules.forgotpassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.programmingstodo.app.R
import com.programmingstodo.app.appcomponents.base.BaseActivity
import com.programmingstodo.app.databinding.ActivityForgotPasswordBinding
import com.programmingstodo.app.modules.forgotpassword.`data`.viewmodel.ForgotPasswordVM
import com.programmingstodo.app.modules.signup.ui.SignupActivity
import kotlin.String
import kotlin.Unit

class ForgotPasswordActivity :
    BaseActivity<ActivityForgotPasswordBinding>(R.layout.activity_forgot_password) {
  private val viewModel: ForgotPasswordVM by viewModels<ForgotPasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.forgotPasswordVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowLeft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
    binding.btnStart.setOnClickListener {
      val destIntent = SignupActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FORGOT_PASSWORD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgotPasswordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
