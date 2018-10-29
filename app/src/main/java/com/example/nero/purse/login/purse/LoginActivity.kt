package com.example.nero.purse.login.purse

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.nero.purse.R
import com.example.nero.purse.purse.PurseActivity
import kotlinx.android.synthetic.main.activity_login.et_password
import kotlinx.android.synthetic.main.activity_login.btn_login

class LoginActivity : AppCompatActivity() {
    val APP_PASSWORD: String = "1111"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener {
            if (APP_PASSWORD.equals(et_password.text.toString())) {
                startActivity(Intent(this, PurseActivity::class.java))
            }
        }
    }
}
