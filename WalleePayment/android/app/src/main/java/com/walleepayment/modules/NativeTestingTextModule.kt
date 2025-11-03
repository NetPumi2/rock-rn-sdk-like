package com.walleepayment.modules

import com.facebook.react.bridge.ReactApplicationContext
import com.walleepayment.modules.NativeTestingTextSpec


class NativeTestingTextModule(reactContext: ReactApplicationContext)  : NativeTestingTextSpec(reactContext) {
    companion object {
        const val NAME = "NativeTestingText"
    }


    override fun getName() = NAME
    override fun getSomeText(): String {
       return "Hello from React Native... getSomeText FCN"
    }

    override fun getSomeOtherText(): String {
        return "Lorem ipsum dolor sit amet, consectetur adipiscing elit. ... getSomeOtherText FCN"
    }

    override fun getGreeting(name: String?): String {
        return "Hello $name !!!!!! getGreeting FCN"

    }
}