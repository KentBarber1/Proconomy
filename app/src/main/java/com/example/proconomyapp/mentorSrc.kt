package com.example.proconomyapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class mentorSrc : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_mentor_src, container, false)
        val new_button = view.findViewById<Button>(R.id.menteeR)
        new_button.setOnClickListener{
            findNavController().navigate(R.id.action_mentorSrc_to_mentor_slider)
        }
        val skip = view.findViewById<TextView>(R.id.skip_this)
        skip.setOnClickListener{
            findNavController().navigate(R.id.action_mentorSrc_to_login_mentor)
        }
        val sign_in = view.findViewById<Button>(R.id.menteeL)
        sign_in.setOnClickListener {
            findNavController().navigate(R.id.action_mentorSrc_to_sign_in_mentor)
        }
        return view
    }

}