package com.example.proconomyapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController

class mentee_slider2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_mentee_slider2, container, false)
        val button = view.findViewById<ImageButton>(R.id.dots)
        button.setOnClickListener{
            findNavController().navigate(R.id.action_mentee_slider2_to_mentee_slider3)
        }
        return view
    }

}