package com.example.montanaqueen.mykitchenassistant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        /*val convertButton = Button(this)
        convertButton.text = "Convert"
        val timersButton = Button(this)
        timersButton.text = "Timers"
        val recipesButton = Button(this)
        recipesButton.text = "Recipes"
        val shoppingButton = Button(this)
        shoppingButton.text = "Shopping Lists"*/
        val directoryArray = arrayOf("Convert","Timers","Recipes","Shopping Lists")
        var listView = findViewById<ListView>(R.id.menu_list)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, directoryArray)
        listView.adapter = adapter
        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE)
        //var pos = listView.checkedItemPosition
        listView.setOnItemClickListener{ adapterView: AdapterView<*>, view1: View, i: Int, l: Long ->
            var pos = listView.checkedItemPosition
            print(pos)
            if (pos == 0){
                startActivity(Intent(this,ConvertActivity::class.java))
            }
        }
    }
}
