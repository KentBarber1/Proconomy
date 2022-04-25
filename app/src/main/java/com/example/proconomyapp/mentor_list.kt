package com.example.proconomyapp

import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proconomyapp.viewHolder.ViewHolderItems
import com.example.proconomyapp.viewHolder.mentorAdapter



class mentor_list : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var layout: LinearLayoutManager
    private lateinit var madapter: mentorAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var item:MutableList<ViewHolderItems> = mutableListOf()
        item.add(ViewHolderItems.mentor("Frank O,UX designer","\n1-3 hours/week","\n$35/week",3,
        "I offer services...","(1)",false))
        item.add(ViewHolderItems.mentor("Frank O,UX designer","\n1-3 hours/week","\n$35/week",4,
            "I offer services...","(7)",false))
        item.add(ViewHolderItems.mentor("Frank O,UX designer","\n1-3 hours/week","\n$35/week",0,
            "I offer services...","(5)",false))
        item.add(ViewHolderItems.mentor("Frank O,UX designer","\n1-3 hours/week","\n$35/week",2,
            "I offer services...","(4)",false))


        val view = inflater.inflate(R.layout.fragment_mentor_list, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.mentorList)
        layout = LinearLayoutManager(requireContext())
        var adapter = mentorAdapter()
        madapter = adapter
        adapter.setOnPicClickListner(object:mentorAdapter.OnPicListener{
            override fun onPicListener(position: Int) {
                findNavController().navigate(R.id.action_mentor_list_to_singleMentorFragment)
            }

        })
        madapter.items = item
        recyclerView.adapter = madapter
        recyclerView.layoutManager = layout



        return view
    }

}