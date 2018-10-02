package com.example.kursivee.myapplication.welcome

import android.view.View
import com.example.kursivee.myapplication.R
import com.example.kursivee.myapplication.WelcomeActivity
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.textView
import org.jetbrains.anko.verticalLayout

class WelcomeUi(val username: String) : AnkoComponent<WelcomeActivity> {


    // WTF does this with(ui) do ???
    override fun createView(ui: AnkoContext<WelcomeActivity>): View = with(ui) {

        verticalLayout {
            textView {
                text = "${resources.getText(R.string.welcome_text)}, ${username}"
            }
        }
    }
}