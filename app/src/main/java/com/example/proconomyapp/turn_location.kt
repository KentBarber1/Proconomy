package com.example.proconomyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class turn_location : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_turn_location)
    }
    fun next(){
        val reg1 = Intent(this, mentee_register4::class.java)
        startActivity(reg1)
    }
    fun back(){
        val reg1 = Intent(this, notification_turn::class.java)
        startActivity(reg1)
    }

}