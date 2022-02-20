package com.example.proconomyapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class mentor_3signin: AppCompatActivity()   {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in_mentor)
    }
    fun email_sign(view: View) {
        val reg = Intent(this, mentor_register0::class.java)
        startActivity(reg)
    }
}
