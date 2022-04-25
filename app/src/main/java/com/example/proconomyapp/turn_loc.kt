package com.example.proconomyapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController


class turn_loc : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_turn_loc, container, false)
        val next = view.findViewById<ImageButton>(R.id.loc)
        print("****************")
        next.setOnClickListener{
            findNavController().navigate(R.id.action_turn_loc_to_mainPageActivity)
        }
        print("****************")

        return view
    }


}