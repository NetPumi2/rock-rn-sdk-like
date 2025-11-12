package com.example.blankproject

import android.app.Application
import com.walleepaymentreact.WalleeStartSdk

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()

//        ReactNativeHostManager.initialize(this)
        WalleeStartSdk.init(application = this)

    }

}