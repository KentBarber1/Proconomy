package com.example.proconomyapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController


class MainAc : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main_ac, container, false)
        val mentee = view.findViewById<Button>(R.id.menteeB)
        val mentor = view.findViewById<Button>(R.id.mentorB)
        mentee.setOnClickListener {
            findNavController().navigate(R.id.action_mainAc2_to_menteeSrc)
        }
        mentor.setOnClickListener{
            findNavController().navigate(R.id.action_mainAc2_to_mentorSrc)
        }

        return view
    }
}
