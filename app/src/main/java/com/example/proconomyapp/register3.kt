package com.example.proconomyapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController

class register3 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_register3, container, false)
        val button = view.findViewById<ImageButton>(R.id.next4)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_register3_to_resgiter4)
        }


        return view
    }


}