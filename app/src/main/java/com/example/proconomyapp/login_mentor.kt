package com.example.proconomyapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController


class login_mentor : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_login_mentor, container, false)
        val button = view.findViewById<ImageButton>(R.id.email)
        button.setOnClickListener{
            findNavController().navigate(R.id.action_login_mentor_to_email_pass)
        }
        return view
    }


}