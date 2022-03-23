package com.example.proconomyapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController


class visual_alb : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_visual_alb, container, false)
        val button = view.findViewById<ImageButton>(R.id.next3)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_visual_alb_to_profile_pic)
        }
        return view
    }

}