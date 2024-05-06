package com.example.myapplicationbtn

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.Timer

class SecondPage : AppCompatActivity() {

    private lateinit var pet: Pet
    private lateinit var PlayTextView: TextView
    private lateinit var FeedTextView: TextView
    private lateinit var CleanTextView: TextView
    private lateinit var HealthTextView: TextView





    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)

        pet = Pet()

        PlayTextView = findViewById(R.id.PlayTextView)
        FeedTextView = findViewById(R.id.FeedTextView)
        CleanTextView = findViewById(R.id.CleanTextView)
        HealthTextView = findViewById(R.id.HealthTextView)

        updateStatus()

        findViewById<Button>(R.id.FeedBtn).setOnClickListener { pet.feed(); updateStatus() }
        findViewById<Button>(R.id.CleanBtn).setOnClickListener { pet.clean(); updateStatus() }
        findViewById<Button>(R.id.PlayBtn).setOnClickListener { pet.play(); updateStatus() }

        startTimer()


    // Author: Zahra Bulbulia
    // URL: https://www.youtube.com/watch?v=70xziKhmOPM




    }



    private fun updateStatus() {
        with(pet) {
            HealthTextView.text = "Health: $health"
            FeedTextView.text = "Hunger: $hunger"
            CleanTextView.text = "Dirty: $Dirty"


        }
    }
    private fun startTimer() {
        GlobalScope.launch {
            while (true) {
                with(pet) {
                    decreaseHealth()
                    increaseBoredom()
                    updateStatus()
                }
                delay(50000)
            }
        }
    }


}