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


class register2 : Fragment() {

    private var listView: ListView? = null
    private var arrayAdapter: ArrayAdapter<String>? = null
    private var itemList = arrayOf(
        "College graduate (Bachelor's)", "College graduate (Master's)", "College student",
        "Employee", "Self-employed", "In between jobs"
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_register2, container, false)
        // Inflate the layout for this fragment
        val button = view.findViewById<ImageButton>(R.id.next3)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_register2_to_register3)
        }

        listView = view.findViewById(R.id.choiceList)
        arrayAdapter = context?.let {
            ArrayAdapter(
                it,
                android.R.layout.simple_list_item_single_choice, itemList)
        }
        listView?.adapter = arrayAdapter
        listView?.choiceMode = ListView.CHOICE_MODE_SINGLE
        //listView?.onItemClickListener = context
        return view
    }

}