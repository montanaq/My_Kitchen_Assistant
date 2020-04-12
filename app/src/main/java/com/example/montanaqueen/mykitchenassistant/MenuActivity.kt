package com.example.montanaqueen.mykitchenassistant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val directoryArray = arrayOf("Convert","Timers","Recipes","Shopping Lists")
        var listView = findViewById<ListView>(R.id.menu_list)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, directoryArray)
        listView.adapter = adapter
        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE)

        listView.setOnItemClickListener{ adapterView: AdapterView<*>, view1: View, i: Int, l: Long ->
            var pos = listView.checkedItemPosition
            print(pos)
            if (pos == 0){
                startActivity(Intent(this,ConvertActivity::class.java))
            }
        }
    }
}
