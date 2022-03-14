package com.example.proconomyapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.ListView
import androidx.navigation.fragment.findNavController

class register3 : Fragment() {
    private var listView: ListView? = null
    private var arrayAdapter: ArrayAdapter<String>? = null
    private var itemList = arrayOf(
        "1-3 hours/week", "4-6 hours/week", "7 or more hours/week"
    )

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
        listView = view.findViewById(R.id.availabilityList)
        arrayAdapter = context?.let {
            ArrayAdapter(
                it,
                android.R.layout.simple_list_item_single_choice, itemList)
        }
        listView?.adapter = arrayAdapter
        listView?.choiceMode = ListView.CHOICE_MODE_SINGLE

        return view
    }


}