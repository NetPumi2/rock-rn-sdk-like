package com.walleepayment

import android.app.Application
//import com.walleepaymentreact.ReactNativeHostManager
import com.walleepaymentreact.WalleeStartSdk

class MyApp : Application() {


    override fun onCreate() {
        super.onCreate()

//        ReactNativeHostManager.initialize(this)
        WalleeStartSdk.init(application = this)

    }
}