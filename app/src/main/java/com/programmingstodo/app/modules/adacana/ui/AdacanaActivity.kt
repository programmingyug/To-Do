package com.programmingstodo.app.modules.adacana.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.programmingstodo.app.R
import com.programmingstodo.app.appcomponents.base.BaseActivity
import com.programmingstodo.app.databinding.ActivityAdacanaBinding
import com.programmingstodo.app.modules.adacana.`data`.viewmodel.AdacanaVM
import com.programmingstodo.app.modules.loginorsignup.ui.LoginOrSignupActivity
import kotlin.String
import kotlin.Unit

class AdacanaActivity : BaseActivity<ActivityAdacanaBinding>(R.layout.activity_adacana) {
  private val viewModel: AdacanaVM by viewModels<AdacanaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.adacanaVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = LoginOrSignupActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.imageLogo.setOnClickListener {
        val destIntent = LoginOrSignupActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "ADACANA_ACTIVITY"

    }
  }
