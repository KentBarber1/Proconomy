package com.example.proconomyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class menteescr : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menteescr)
    }
    fun backClick(view: View) {
        val myIntent = Intent(this, MainActivity::class.java)
        startActivity(myIntent)
    }
    fun menteeRegister(view: View) {
        val reg = Intent(this, mentee_register::class.java)
        startActivity(reg)
    }

    fun menteeLogin(view: View) {
        val reg = Intent(this, menteeLogin::class.java)
        startActivity(reg)
    }

}