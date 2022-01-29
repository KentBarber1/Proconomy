package com.example.proconomyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class mentee_register2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentee_register2)
    }
    fun backClick(view: View){
        val myIntent = Intent(this, mentee_register::class.java)
        startActivity(myIntent)
    }
    fun menteeRegister_3(view: View) {
        val reg = Intent(this, mentee_register3::class.java)
        startActivity(reg)
    }
}