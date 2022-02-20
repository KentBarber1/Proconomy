package com.example.proconomyapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class mentor_register0: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activty_mentorpass)
    }
    fun backClick(view: View) {
        val myIntent = Intent(this, mentor_3signin::class.java)
        startActivity(myIntent)
    }
    fun next(view:View){
        val myIntent = Intent(this, MentorRegister::class.java)
        startActivity(myIntent)
    }

}