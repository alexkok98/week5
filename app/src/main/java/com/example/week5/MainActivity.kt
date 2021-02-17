package com.example.week5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnEnter = findViewById<Button>(R.id.button_enter)

        btnEnter.setOnClickListener()
        {
            val intent = Intent(this,Input::class.java)

            val username = findViewById<TextView>(R.id.txt_username).text

            intent.putExtra("username",username.toString())

            startActivity(intent)
        }

    }
}