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

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.image_recognition)

        btnsend.setOnClickListener{
            val intent = Intent(this, ImageActivity::class.java);
            startActivity(intent)
            Toast.makeText(this, "已送出", Toast.LENGTH_LONG).show()

            class ImageActivity (val num:Int){
                fun guess():Int{
                    return (1..num).random()
                }
            }
            fun Startguess(){
                val hand= ImageActivity(3)
                val result=hand.guess()
                val image=findViewById<ImageView>(R.id.imageview1)

                val end= when (result){
                    1->R.drawable.image1
                    2->R.drawable.image2
                    else->R.drawable.image3
                }
                image.setImageResource(result)
                image.contentDescription=result.toString()
            }
            val sure=findViewById<Button>(R.id.sure)
            sure.setOnClickListener {
                Startguess()
            }
            Startguess()
        }
    }

}

