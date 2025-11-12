package com.walleepaymentreact

import android.app.Application
import com.callstack.reactnativebrownfield.OnJSBundleLoaded
import com.callstack.reactnativebrownfield.ReactNativeBrownfield
import com.facebook.react.PackageList
import com.facebook.react.ReactNativeApplicationEntryPoint.loadReactNative
import com.walleepayment.modules.ReactNativeTestingTextPackage

object ReactNativeHostManager {
    fun initialize(application: Application, onJSBundleLoaded: OnJSBundleLoaded? = null) {
        loadReactNative(application)

        val packageList = PackageList(application).packages
        packageList.add(ReactNativeTestingTextPackage())



        ReactNativeBrownfield.initialize(application, packageList, onJSBundleLoaded)
    }
}
