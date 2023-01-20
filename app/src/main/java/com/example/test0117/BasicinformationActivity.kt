package com.example.test0117

import android.view.View
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.basic_information.*
import kotlinx.android.synthetic.main.image_recognition.*


class BasicinformationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.basic_information)

        send.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java);
            startActivity(intent)
            Toast.makeText(this, "已送出", Toast.LENGTH_LONG).show()
        }
    }
}