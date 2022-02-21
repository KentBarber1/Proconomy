package com.example.proconomyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Context
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.google.android.material.chip.Chip

class mentee_register4 : AppCompatActivity() , AdapterView.OnItemClickListener {
    private var listView: ListView? = null
    private var arrayAdapter: ArrayAdapter<String>? = null
    private var itemList = arrayOf(
        "1-3 hours/week", "4-6 hours/week", "7 or more hours/week"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentee_register4)

        listView = findViewById(R.id.availabilityList)
        arrayAdapter = ArrayAdapter(applicationContext,
            android.R.layout.simple_list_item_single_choice, itemList)
        listView?.adapter = arrayAdapter
        listView?.choiceMode = ListView.CHOICE_MODE_SINGLE
        listView?.onItemClickListener = this

    }

    fun Context.toast(message:String)=
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()

    fun backClick(view: View){
        val myIntent = Intent(this, mentee_register3::class.java)
        startActivity(myIntent)
    }

    override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        var items:String = p0?.getItemAtPosition(p2) as String
        Toast.makeText(applicationContext, "$items", Toast.LENGTH_LONG).show()
    }

    fun completeDetails(view: View) {
        val myIntent = Intent(this, notification_turn::class.java)
        startActivity(myIntent)
    }
}