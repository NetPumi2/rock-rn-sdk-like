package com.walleepaymentreact.activity

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.callstack.reactnativebrownfield.ReactNativeFragment
import com.walleepaymentreact.R

class ReactActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_react)


        val showRNAppBtn = findViewById<Button>(R.id.show_rn_app_btn)


        val rnAppFragment = ReactNativeFragment.createReactNativeFragment("WalleePayment")

        showRNAppBtn.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentContainer, rnAppFragment)
                .commit()
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}