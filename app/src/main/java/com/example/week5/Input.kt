package com.example.week5

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Input : AppCompatActivity() {
    var bmiIndex:Double=0.00

    override fun onCreate(savedInstanceState: Bundle?)
        {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.fragment_input)

            val username = intent.getStringExtra("username")


            val tv = findViewById<TextView>(R.id.text_name)
            tv.text = username

            val btn = findViewById<Button>(R.id.button_calculate)
            btn.setOnClickListener {

                val weight = findViewById<TextView>(R.id.value_weight).text.toString()
                val height = findViewById<TextView>(R.id.value_height).text.toString()
                val statustext = findViewById<TextView>(R.id.text_status)

                bmiIndex = weight.toDouble() / (height.toDouble()*height.toDouble())
                statustext.text = getstatus()
            }


        }
    fun getstatus():String
    {
        if(bmiIndex<=18.5)
            return "Underweight"
        else if(bmiIndex<=24.9)
            return "Normal weight"
        else if(bmiIndex<=29.9)
            return "Overweight"
        else if(bmiIndex<=34.9)
            return "Obesity Class I"
        else if(bmiIndex<=39.9)
            return "Obesity Class II"
        else
            return "Obesity Class III"
    }
    }


