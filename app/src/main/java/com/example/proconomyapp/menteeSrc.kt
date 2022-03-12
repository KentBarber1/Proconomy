package com.example.proconomyapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController

class menteeSrc : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view =  inflater.inflate(R.layout.fragment_mentee_src, container, false)
        val new_button = view.findViewById<Button>(R.id.menteeR)
        new_button.setOnClickListener{
            findNavController().navigate(R.id.action_menteeSrc_to_mentee_slider)
        }
        return view
    }


}