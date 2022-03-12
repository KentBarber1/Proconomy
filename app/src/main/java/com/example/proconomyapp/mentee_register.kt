package com.example.proconomyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import com.example.proconomyapp.databinding.ActivityMenteeRegisterBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;


class mentee_register : AppCompatActivity() {

    private lateinit var binding: ActivityMenteeRegisterBinding
    private lateinit var firebaseAuth: FirebaseAuth
    private var email = ""
    private var password = ""
    private var passwordReEnter = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenteeRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        val menteeSignUp = findViewById<ImageButton>(R.id.menteeSignUp)
        menteeSignUp.setOnClickListener {
            validateData()
        }
    }

    private fun validateData() {
        // get data
        email = binding.menteeEmailReg.text.toString().trim()
        password = binding.menteePasswordReg.text.toString().trim()
        passwordReEnter = binding.menteeRePass.text.toString().trim()

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            binding.menteeEmailReg.error = "Invalid email format"
        } else if (TextUtils.isEmpty(password)) {
            binding.menteePasswordReg.error = "Please enter a password"
        } else if (password.length < 6) {
            binding.menteePasswordReg.error = "Password must be at least 6 characters"
        } else if (!password.equals(passwordReEnter)) {
            binding.menteeRePass.error = "Passwords do not match"
        } else {
            firebaseSignUp()
        }

    }

    private fun firebaseSignUp() {
        firebaseAuth.createUserWithEmailAndPassword(email, password)
            .addOnSuccessListener {
                //sign success
                val firebaseUser = firebaseAuth.currentUser
                val email = firebaseUser!!.email
                Toast.makeText(this, "Account created with email $email", Toast.LENGTH_SHORT).show()

                finish()

            }
            .addOnFailureListener {e->
                //sign failure
                Toast.makeText(this, "Signup failed due to ${e.message}", Toast.LENGTH_SHORT).show()
            }
    }

    fun backClick(view: View){
        val myIntent = Intent(this, MentorSlide1::class.java)
        startActivity(myIntent)
    }

    fun next(view: View) {
        val reg = Intent(this, mentee_register2::class.java)
        startActivity(reg)
    }



}