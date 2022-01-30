package com.example.proconomyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class mentorscr : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentorscr)
    }
    fun backClick(view: View){
        val myIntent = Intent(this, MainActivity::class.java)
        startActivity(myIntent)
    }

    fun mentorRegister(view: View) {
        //val reg = Intent(this, mentee_register::class.java)
        //startActivity(reg)
    }

    fun mentorLogin(view: View) {
        //val login = Intent(this, )
    }
}