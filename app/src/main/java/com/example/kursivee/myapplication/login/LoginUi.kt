package com.example.kursivee.myapplication.login

import android.view.View
import com.example.kursivee.myapplication.MainActivity
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext

import android.text.InputType.TYPE_CLASS_TEXT
import android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD
import android.widget.Button
import android.widget.EditText
import com.example.kursivee.myapplication.R
import org.jetbrains.anko.*
import org.jetbrains.anko.design.textInputLayout
import org.jetbrains.anko.sdk25.coroutines.onClick


class LoginUi : AnkoComponent<MainActivity> {

    private val customStyle = { v: Any ->
        when (v) {
            is Button -> v.textSize = 26f
            is EditText -> v.textSize = 24f
        }
    }



    override fun createView(ui: AnkoContext<MainActivity>): View = with(ui) {
        verticalLayout {
            padding = dip(32)

            val userLayout = textInputLayout {
                isPasswordVisibilityToggleEnabled = true

                val userEditText = editText {
                    inputType = TYPE_CLASS_TEXT or TYPE_TEXT_VARIATION_PASSWORD
                    hint = resources.getString(R.string.name_text)
                }
            }

            val pwdLayout = textInputLayout {
                isPasswordVisibilityToggleEnabled = true

                val pwdEditText = editText {
                    inputType = TYPE_CLASS_TEXT or TYPE_TEXT_VARIATION_PASSWORD
                    hint = resources.getString(R.string.password_text)
                }
            }
            button("Submit") {
                onClick {
                    doAsync {
                        val response = LoginService().login(userLayout.editText?.text.toString(),
                                pwdLayout.editText?.text.toString())
                        uiThread {
                            toast(response?.success.toString())
                        }
                    }
                }
            }
        }.applyRecursively(customStyle)

    }
}