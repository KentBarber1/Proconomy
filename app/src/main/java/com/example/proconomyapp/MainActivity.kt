package com.example.proconomyapp

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.TextView
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
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