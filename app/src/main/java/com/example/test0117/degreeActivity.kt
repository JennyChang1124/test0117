package com.example.test0117

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.degree.*
import kotlinx.android.synthetic.main.image_recognition.*

    class degreeActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.degree)

            degree.setOnClickListener{
                val intent = Intent(this,BasicinformationActivity::class.java);
                startActivity(intent)
                Toast.makeText(this, "已送出", Toast.LENGTH_LONG).show()
            }
        }
    }