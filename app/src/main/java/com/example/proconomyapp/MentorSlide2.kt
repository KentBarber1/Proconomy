package com.example.proconomyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MentorSlide2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentor_slide2)
    }
    fun backClick(view: View) {
        val myIntent = Intent(this, mentorscr::class.java)
        startActivity(myIntent)
    }
    fun slide3(view: View) {
        val reg = Intent(this, MentorSlide3::class.java)
        startActivity(reg)


    }
}