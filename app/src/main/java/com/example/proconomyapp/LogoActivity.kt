package com.example.proconomyapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class LogoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.logo_page)
    }

    fun toMainActivity(view: View){
        val myIn = Intent(this, MainActivity::class.java)
        startActivity(myIn)
    }
}