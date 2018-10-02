package com.example.kursivee.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.kursivee.myapplication.login.LoginUi
import org.jetbrains.anko.setContentView

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    LoginUi().setContentView(this)
  }
}
