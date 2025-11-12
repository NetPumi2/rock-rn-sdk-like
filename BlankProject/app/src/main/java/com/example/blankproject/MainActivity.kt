package com.example.blankproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.callstack.reactnativebrownfield.ReactNativeFragment
import com.walleepaymentreact.WalleeStartSdk

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val showRNAppBtn = findViewById<Button>(R.id.show_rn_app_btn)


        val rnAppFragment = ReactNativeFragment.createReactNativeFragment("WalleePayment")

        showRNAppBtn.setOnClickListener {
        WalleeStartSdk.instance?.lunch(this)
//            supportFragmentManager
//                .beginTransaction()
//                .replace(R.id.fragmentContainer, rnAppFragment)
//                .commit()
        }






        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}


