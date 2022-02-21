package com.example.proconomyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MenteeSlide1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentee_slide1)
    }
    fun backClick(view: View) {
        val myIntent = Intent(this, menteescr::class.java)
        startActivity(myIntent)
    }
    fun slide2(view: View) {
        val reg = Intent(this, MenteeSlide2::class.java)
        startActivity(reg)
        overridePendingTransition(R.anim.slide_inr,R.anim.slide_outl)
    }
}