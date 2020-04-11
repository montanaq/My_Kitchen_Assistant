package com.example.montanaqueen.mykitchenassistant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val directoryArray = arrayOf("Convert","Timers","Shopping List")
        var listView = findViewById<ListView>(R.id.menu_list)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, directoryArray)
        listView.adapter = adapter
    }
}
