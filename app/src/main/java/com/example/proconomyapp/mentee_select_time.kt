package com.example.proconomyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class mentorscr : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentor_profile)
    }
    fun backClick(view: View){
        val myIntent = Intent(this, MainAc::class.java)
        startActivity(myIntent)
    }

    fun mentorRegister(view: View) {
        val reg = Intent(this, mentor_3signin::class.java)
        startActivity(reg)
    }

    fun basic(view:View) {
        val reg = Intent(this, mentor_3signin::class.java)
        startActivity(reg)
    }


}