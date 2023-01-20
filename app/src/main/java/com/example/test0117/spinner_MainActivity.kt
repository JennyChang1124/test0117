package com.example.test0117

import android.R
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class spinner_MainActivity : AppCompatActivity() {
    private var sp: Spinner? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.select_dialog_item)
        sp = findViewById<View>(R.id.secondaryProgress) as Spinner

        sp!!.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
                val result = parent.getItemAtPosition(position).toString()
                Toast.makeText(this@spinner_MainActivity, result, Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
    }
}