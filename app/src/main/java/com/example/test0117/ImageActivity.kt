package com.example.test0117

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.image_recognition.*
import kotlin.random.Random

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.image_recognition)

        btnsend.setOnClickListener {
            Toast.makeText(this, "已送出", Toast.LENGTH_LONG).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val randomNo = (1..10).random()
        var imageDice: Int
        val images: ImageView = findViewById(R.id.imageview1)

        when (randomNo) {
            1 -> {
                imageDice = R.drawable.image5
            }
            2 -> {
                imageDice = R.drawable.image4
            }
            3 -> {
                imageDice = R.drawable.image3
            }
            4 -> {
                imageDice = R.drawable.image2
            }
            5 -> {
                imageDice = R.drawable.image6
            }
            6 -> {
                imageDice = R.drawable.image7
            }
            7 -> {
                imageDice = R.drawable.image8
            }
            8 -> {
                imageDice = R.drawable.image9
            }
            9-> {
                imageDice = R.drawable.image10
            }
            else -> {
                imageDice = R.drawable.image1
            }
        }
        images.setImageResource(imageDice)
    }
}

