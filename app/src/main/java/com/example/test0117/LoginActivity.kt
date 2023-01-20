package com.example.test0117

import android.view.View
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.image_recognition.*
import kotlinx.android.synthetic.main.login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        sure.setOnClickListener {
            val intent = Intent(this, ImageActivity::class.java);
            startActivity(intent)
        }
    }
}