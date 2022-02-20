package com.example.proconomyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MentorRegister : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentor_register)
    }
    fun backClick(view: View) {
        val myIntent = Intent(this, MentorSlide3::class.java)
        startActivity(myIntent)
    }
    fun mentorRegister(view: View) {
        val reg = Intent(this, MentorRegister2::class.java)
        startActivity(reg)
    }
}