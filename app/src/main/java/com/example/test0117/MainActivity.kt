package com.example.test0117

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btntest0.setOnClickListener{
            val intent = Intent(this, userloginActivity::class.java);
            startActivity(intent)
        }
        btntest1.setOnClickListener{
            val intent = Intent(this, userloginActivity::class.java);
            startActivity(intent)
        }
        }
    }
