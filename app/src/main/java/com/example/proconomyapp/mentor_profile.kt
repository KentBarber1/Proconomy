package com.example.proconomyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import androidx.core.widget.ListViewAutoScrollHelper

class mentor_profile : AppCompatActivity() {

    //private var listView: ListView? = null
    private var arrayAdapter: ArrayAdapter<String>? = null
    private var itemList = arrayOf(
        "Nielson Norman UX Practitioner", "IBM Design Thinking Practitioner",
        "Interaction Design Foundation: UX & Design Thinking",
        "Interaction Design Foundation: Affordances in UI Design", "Google University UX Design 101")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentor_profile)

        var listView = findViewById<ListView>(R.id.certifications)
        arrayAdapter = ArrayAdapter<String>(applicationContext,
            R.layout.list_row, itemList)

        listView?.adapter = arrayAdapter

        ListHelper.getListViewSize(listView)
    }
    fun backClick(view: View) {
        val myIntent = Intent(this, mentor_profile::class.java)
        startActivity(myIntent)
    }
    fun seeAvailability(view: View) {
        val reg = Intent(this, view_calendar::class.java)
        startActivity(reg)
    }


}
