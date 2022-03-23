package com.example.proconomyapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [register2_mentor.newInstance] factory method to
 * create an instance of this fragment.
 */
class register2_mentor : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_register2_mentor, container, false)
        val industries = resources.getStringArray(R.array.industries)
        val arrayAdapter = ArrayAdapter(requireContext(),R.layout.drop_down_item,industries)
        view.findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView).setAdapter(arrayAdapter)
        val button = view.findViewById<ImageButton>(R.id.next3)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_register2_mentor_to_register3_mentor)
        }

        return view
    }


}