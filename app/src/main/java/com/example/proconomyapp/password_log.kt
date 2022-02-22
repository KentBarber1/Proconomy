package com.example.proconomyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class password_log : AppCompatActivity() {
    lateinit var inte: Intent
    lateinit var ment:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_log)
        inte = getIntent()
        ment = inte.getStringExtra("key").toString()
        if (ment == "mentor"){
            val t1= findViewById<TextView>(R.id.textView11)
            t1.setText(R.string.hire)
            val t2 = findViewById<TextView>(R.id.textView13)
            t2.setText(R.string.get_insider)
        }


    }
}