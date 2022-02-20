package com.example.proconomyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MentorSlide1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentor_slide1)
    }
    fun backClick(view: View) {
        val myIntent = Intent(this, mentorscr::class.java)
        startActivity(myIntent)
    }
    fun slide2(view: View) {
        val reg = Intent(this, MentorSlide2::class.java)
        startActivity(reg)
        overridePendingTransition(R.anim.slide_inr,R.anim.slide_outl)
    }
}