package com.example.proconomyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun mentorClick(view: View){
        val myIn = Intent(this, mentorscr::class.java)
        startActivity(myIn)
    }

    fun menteeClick(view:View) {
        val myIn = Intent(this, menteescr::class.java)
        startActivity(myIn)
    }

}