package com.example.montanaqueen.mykitchenassistant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class TimerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer)
        val timerArray = arrayOf("Timer 1", "Timer 2", "Timer 3", "Timer 4")
        val timerView = findViewById<ListView>(R.id.timer_list)
        val adapt = ArrayAdapter(this, android.R.layout.simple_list_item_1, timerArray)
        timerView.adapter = adapt
    }
}
