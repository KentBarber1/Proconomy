package com.example.proconomyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class mentor_profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentor_profile)
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
