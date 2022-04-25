package com.example.proconomyapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class mentee_3signin : AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in_mentee)
    }
    fun backClick(view: View) {
        val myIntent = Intent(this, MainAc::class.java)
        startActivity(myIntent)
    }
    fun email_sign(view: View) {
        val reg = Intent(this, mentee_login::class.java)
        startActivity(reg)
    }

}
