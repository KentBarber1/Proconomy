package com.example.proconomyapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController





class email_pass : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_email_pass, container, false)
        val button = view.findViewById<ImageButton>(R.id.next)
        button.setOnClickListener{
            findNavController().navigate(R.id.action_email_pass_to_register)
        }
        return view
    }


}