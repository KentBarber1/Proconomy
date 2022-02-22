package com.example.proconomyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class login_mentee : AppCompatActivity() {
    lateinit var inte:Intent
    lateinit var ment:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_mentee)
        inte = getIntent()
        ment = inte.getStringExtra("key").toString()
        if (ment == "mentor"){
            val t1= findViewById<TextView>(R.id.textView16)
            t1.setText(R.string.hire)
            val t2 = findViewById<TextView>(R.id.textView17)
            t2.setText(R.string.get_insider)
        }

    }
    fun next(view: View){
        val myIn = Intent(this, password_log::class.java)
        println(ment)
        myIn.putExtra("key",ment)
        startActivity(myIn)
    }
}