package com.example.proconomyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class mentor_register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentor_register)
    }

    fun backClick(view: View){
        val myIntent = Intent(this, mentor_register::class.java)
        startActivity(myIntent)
    }

    fun mentorRegister_2(view: View) {
        val reg = Intent(this, mentor_register2::class.java)
        startActivity(reg)
    }
}