package com.example.proconomyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MenteeSlide3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentee_slide3)
    }
    fun backClick(view: View) {
        val myIntent = Intent(this, menteescr::class.java)
        startActivity(myIntent)
    }
    fun menteeRegister(view: View) {
        val reg = Intent(this, mentee_register::class.java)
        startActivity(reg)


    }


}