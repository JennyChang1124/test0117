package com.example.test0117

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.userlogin.*
import android.view.View


class userloginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.userlogin)

        btnLogin.setOnClickListener{

            if (edUsername.text.trim().isNotEmpty()|| edPassword.text.trim().isNotEmpty()) {
                Toast.makeText(this, "Input provided", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText( this,"Input required", Toast.LENGTH_LONG).show()
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