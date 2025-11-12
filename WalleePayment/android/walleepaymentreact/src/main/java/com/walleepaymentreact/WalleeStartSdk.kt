package com.walleepaymentreact

import android.app.Application
import android.content.Context
import android.content.Intent
import android.util.Log
import com.example.mylibrary.TestingLib
import com.walleepaymentreact.activity.ReactActivity
import ch.twint.payment.sdk.Twint
import com.netcetera.threeds.sdk.ThreeDS2ServiceInstance

class WalleeStartSdk private constructor(application: Application) {

    companion object {
        var instance: WalleeStartSdk? = null

        fun init(application: Application) {
            if(instance == null)
                instance = WalleeStartSdk(application)
            else Log.e("MobileSDK", "SDK has already been initialized")
        }
    }

    init {
        ReactNativeHostManager.initialize(application, null)
    }

    fun lunch(context: Context,){
        val mainReactActivityIntent = Intent(context, ReactActivity::class.java)
        context.startActivity(mainReactActivityIntent)

    }

    fun testLog() {
        TestingLib().showLog("TADYYYYYYYYYYY===============")
    }

    fun netceteraSdkInitLog() {
        val three = ThreeDS2ServiceInstance.get()
        Log.e("XXXX", "============================NETCETERA SDK VERSION" + three.sdkVersion)
    }


}