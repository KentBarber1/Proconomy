package com.example.proconomyapp

import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController


class sign_in_mentee : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sign_in_mentee, container, false)
        val sign_in = view.findViewById<ImageButton>(R.id.email)
        sign_in.setOnClickListener {
            findNavController().navigate(R.id.action_sign_in_mentee_to_mentee_in2)
        }
        return view
    }

}