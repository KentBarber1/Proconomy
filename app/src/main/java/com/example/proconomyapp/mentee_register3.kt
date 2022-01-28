package com.example.proconomyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class mentee_register3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentee_register3)
    }
    fun backClick(view: View){
        val myIntent = Intent(this, mentee_register2::class.java)
        startActivity(myIntent)
    }
}