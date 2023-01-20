package com.example.test0117

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.view.View
import kotlinx.android.synthetic.main.userloginn.*





class user_loginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.userloginn)

        btnLogin1.setOnClickListener{

            if (edUsername.text.trim().isNotEmpty()|| edPassword.text.trim().isNotEmpty()) {
                Toast.makeText(this, "使用者名稱和密碼輸入錯誤!", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText( this,"請輸入使用者名稱和密碼!", Toast.LENGTH_LONG).show()
            }
            val intent = Intent(this, Main_logActivity::class.java);
            startActivity(intent)

            tvRegister1.setOnClickListener {
                val intent = Intent(this, user_RegisterActivity::class.java);
                startActivity(intent)
            }
        }
    }
}