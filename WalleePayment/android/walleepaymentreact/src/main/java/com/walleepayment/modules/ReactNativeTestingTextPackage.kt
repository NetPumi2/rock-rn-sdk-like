package com.walleepayment.modules

import android.util.Log
import com.facebook.react.BaseReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.model.ReactModuleInfo
import com.facebook.react.module.model.ReactModuleInfoProvider

class ReactNativeTestingTextPackage : BaseReactPackage() {
    override fun getModule(name: String, reactContext: ReactApplicationContext): NativeModule? {
        Log.e("MY ERROR","NativeTestingTextPackage getModule $name")
         if (name == ReactNativeTestingTextModule.NAME) {
            Log.e("MY ERROR", "MODULE EXISTUJE" + name)
             return ReactNativeTestingTextModule(reactContext)
        } else {
            Log.e("MY ERROR", "MODULE NEEEE EXISTUJE" + name)
             return  null
        }
    }

    override fun getReactModuleInfoProvider() = ReactModuleInfoProvider {
        Log.e("MY ERROR","NativeTestingTextPackage getReactModuleInfoProvider"+ ReactNativeTestingTextModule.toString())
        mapOf(
            ReactNativeTestingTextModule.NAME to ReactModuleInfo(
                name = ReactNativeTestingTextModule.NAME,
                className = ReactNativeTestingTextModule.NAME,
                canOverrideExistingModule = false,
                needsEagerInit = false,
                isCxxModule = false,
                isTurboModule = true
            )
        )
    }
}