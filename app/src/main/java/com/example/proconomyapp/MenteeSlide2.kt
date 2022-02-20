package com.example.proconomyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MenteeSlide2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentee_slide2)
    }
    fun backClick(view: View) {
        val myIntent = Intent(this, menteescr::class.java)
        startActivity(myIntent)
    }
    fun slide3(view: View) {
        val reg = Intent(this, MenteeSlide3::class.java)
        startActivity(reg)
        overridePendingTransition(R.anim.slide_inr,R.anim.slide_outl)
    }
    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_inl,R.anim.slide_outr)
    }
}