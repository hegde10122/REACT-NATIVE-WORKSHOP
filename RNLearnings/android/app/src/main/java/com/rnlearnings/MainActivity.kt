package com.rnlearnings

import android.os.Bundle
import com.facebook.react.ReactActivity
import com.facebook.react.ReactActivityDelegate
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint
import com.facebook.react.defaults.DefaultReactActivityDelegate

class MainActivity : ReactActivity() {

  override fun getMainComponentName(): String = "RNLearnings"

 override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(null)
       // RNScreensPackage.register(this) // Ensure this line is present
    }

  override fun createReactActivityDelegate(): ReactActivityDelegate {
    return DefaultReactActivityDelegate(
        this,
        mainComponentName,
        DefaultNewArchitectureEntryPoint.fabricEnabled
    )
}
}
