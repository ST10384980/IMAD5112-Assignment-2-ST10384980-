package com.example.myapplicationbtn

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val StartButton = findViewById<Button>(R.id.StartBtn)

        StartButton.setOnClickListener {
            val Intent = Intent(this, SecondPage::class.java)

            startActivity(Intent)
        }
    }
}