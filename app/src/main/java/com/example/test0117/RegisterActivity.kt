package com.example.test0117

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.registerlogin.*


class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registerlogin)

        btnRegister.setOnClickListener {
            if (editUsername.text.trim().isNotEmpty() || editEmail.text.trim()
                    .isNotEmpty() || editCPassword.text.trim()
                    .isNotEmpty() || editPassword.text.trim().isNotEmpty()
            ) {
                Toast.makeText(this, "註冊成功!", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "請填完整!", Toast.LENGTH_LONG).show()
            }
        }


        tvLogin.setOnClickListener {
            val   intent = Intent(this,MainActivity::class.java);
            startActivity(intent)
        }
    }
}