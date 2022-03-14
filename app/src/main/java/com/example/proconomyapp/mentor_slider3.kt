package com.example.proconomyapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class mentor_slider3 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_mentor_slider3, container, false)
        val button = view.findViewById<Button>(R.id.contSlide2)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_mentor_slider3_to_login_mentor)
        }
        return view
    }
}