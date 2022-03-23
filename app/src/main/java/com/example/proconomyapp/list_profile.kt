package com.example.proconomyapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController


class list_profile : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_list_profile, container, false)
        val button = view.findViewById<Button>(R.id.create)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_list_profile_to_resgiter4)
        }
        val buttonV = view.findViewById<Button>(R.id.view)
        buttonV.setOnClickListener {
            findNavController().navigate(R.id.action_visual_alb_to_profile_pic)
        }

        return view
    }

}
//action_list_profile_to_resgiter4