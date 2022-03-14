package com.example.proconomyapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController


class resgiter4 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_resgiter4, container, false)
        val buttonT = view.findViewById<ImageButton>(R.id.turnon)
        val buttonNT = view.findViewById<ImageButton>(R.id.notTurn)
        buttonT.setOnClickListener {
            findNavController().navigate(R.id.action_resgiter4_to_turn_loc)
        }
        buttonNT.setOnClickListener {
            findNavController().navigate(R.id.action_resgiter4_to_turn_loc)
        }
        return view
    }

}