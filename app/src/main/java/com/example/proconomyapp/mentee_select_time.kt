package com.example.proconomyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class mentee_select_time : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentee_select_time)
    }
    fun backClick(view: View){
        val myIntent = Intent(this, view_calendar::class.java)
        startActivity(myIntent)
    }
}