package com.example.blankproject

import android.app.Application
import com.walleepaymentreact.ReactNativeHostManager

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()

        ReactNativeHostManager.initialize(this)
    }

}