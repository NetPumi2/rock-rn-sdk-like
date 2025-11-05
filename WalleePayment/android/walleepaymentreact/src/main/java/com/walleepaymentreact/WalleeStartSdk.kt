package com.walleepaymentreact

import android.app.Application
import android.content.Context
import android.content.Intent
import android.util.Log
import com.walleepaymentreact.activity.ReactActivity

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

}