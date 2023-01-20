package com.example.test0117

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btntest0.setOnClickListener{
            val intent = Intent(this, user_loginActivity::class.java);
            startActivity(intent)
        }
        btntest1.setOnClickListener{
            val intent = Intent(this, userloginActivity::class.java);
            startActivity(intent)
        }
        tvtexthelp.setOnClickListener{
            val intent = Intent(this, timerActivity::class.java);
            startActivity(intent)
        }
        }
    }
