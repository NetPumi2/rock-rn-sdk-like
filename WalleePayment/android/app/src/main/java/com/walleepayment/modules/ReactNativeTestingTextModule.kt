package com.walleepayment.modules

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactMethod


class ReactNativeTestingTextModule(reactContext: ReactApplicationContext)  : NativeTestingTextSpec(reactContext)  {
    companion object {
        const val NAME = "NativeTestingText"
    }

    override fun getName() = NAME

    @ReactMethod
    override fun getSomeText(): String {
       return "Hello from React Native... getSomeText FCN"
    }

    @ReactMethod
    override fun getSomeOtherText(): String {
        return "Lorem ipsum dolor sit amet, consectetur adipiscing elit. ... getSomeOtherText FCN"
    }

    @ReactMethod
    override fun getGreeting(name: String?): String {
        return "Hello $name !!!!!! getGreeting FCN"

    }
}