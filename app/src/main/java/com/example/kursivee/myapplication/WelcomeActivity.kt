package com.example.kursivee.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.kursivee.myapplication.welcome.WelcomeUi
import org.jetbrains.anko.setContentView

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WelcomeUi(intent.extras.getString("username")).setContentView(this)
    }
}