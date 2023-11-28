package com.programmingstodo.app.modules.adacana.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.programmingstodo.app.modules.adacana.`data`.model.AdacanaModel
import org.koin.core.KoinComponent

class AdacanaVM : ViewModel(), KoinComponent {
  val adacanaModel: MutableLiveData<AdacanaModel> = MutableLiveData(AdacanaModel())

  var navArguments: Bundle? = null
}
