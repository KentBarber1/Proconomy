package com.example.proconomyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class notification_turn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification_turn)
    }

    fun next(view: View) {
        val reg = Intent(this, turn_location::class.java)
        startActivity(reg)
    }

    fun backClick(view:View) {
        val reg1 = Intent(this, mentee_register4::class.java)
        startActivity(reg1)
    }
}
