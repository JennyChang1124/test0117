package com.example.test0117

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.Toast
import kotlinx.android.synthetic.main.userlogin.*
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText


class userloginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.userlogin)

        btnLogin.setOnClickListener{

            if (edUsername.text.trim().isNotEmpty()|| edPassword.text.trim().isNotEmpty()) {
                Toast.makeText(this, "使用者名稱和密碼輸入錯誤!", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText( this,"請輸入使用者名稱和密碼!", Toast.LENGTH_LONG).show()
            }
            val intent = Intent(this, MainlogActivity::class.java);
            startActivity(intent)

            tvRegister.setOnClickListener {
                val intent = Intent(this, RegisterActivity::class.java);
                startActivity(intent)
            }
        }
    }
}