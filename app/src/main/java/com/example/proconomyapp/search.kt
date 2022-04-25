package com.example.proconomyapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageButton
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proconomyapp.viewHolder.ViewHolderItems
import com.example.proconomyapp.viewHolder.mainPageadapter


class search : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var mlayoutManager: LinearLayoutManager
    private lateinit var madapter: mainPageadapter
    var AlbumList = mutableListOf<ViewHolderItems>()




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var item:MutableList<ViewHolderItems> = mutableListOf()
        item.add(ViewHolderItems.Search)
        item.add(ViewHolderItems.Service("Add your visual album",createAlbum1()))
        item.add(ViewHolderItems.Service("Learn the basics of real estate",createAlbum1()))
        item.add(ViewHolderItems.Service("Pass your real estate lisence exam",createAlbum1()))
        item.add(ViewHolderItems.otherfield)
        item.add(ViewHolderItems.otherService("Software Development"))
        item.add(ViewHolderItems.otherService("Agile Methodology"))
        item.add(ViewHolderItems.otherService("NFTs"))
        item.add(ViewHolderItems.otherService("Blockchain Development"))
        item.add(ViewHolderItems.otherService("Cryptocurrency Investing"))
        item.add(ViewHolderItems.otherService("Business Management"))
        item.add(ViewHolderItems.otherService("Financial Accounting"))
        item.add(ViewHolderItems.otherService("Freelance Writing"))
        item.add(ViewHolderItems.otherService("Investing"))
        item.add(ViewHolderItems.otherService("Social Media Marketing"))


        val view = inflater.inflate(R.layout.fragment_search, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        mlayoutManager = LinearLayoutManager(requireContext())
        var adapter = mainPageadapter()
        madapter = adapter
        madapter.items = item
        recyclerView.layoutManager = mlayoutManager
        recyclerView.adapter = madapter
        val button = view.findViewById<ImageButton>(R.id.favorites)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_search_to_mentor_list)
        }
        return view

    }
    private fun createAlbum1(): MutableList<ViewHolderItems.oneService>{
        var services = mutableListOf<ViewHolderItems.oneService>()
        services.add(ViewHolderItems.oneService("Resume Prep", "10 mentors available"))
        services.add(ViewHolderItems.oneService("Portfolio Review" , "12 mentors available"))
        services.add(ViewHolderItems.oneService("Career Coaching" , "14 mentors available"))
        services.add(ViewHolderItems.oneService("Case Study Design" , "15 mentors available"))
        AlbumList.add(ViewHolderItems.Service("Add your visual album",services))
        return services

    }
    private fun createAlbum2(): MutableList<ViewHolderItems.oneService>{
        var services = mutableListOf<ViewHolderItems.oneService>()
        services.add(ViewHolderItems.oneService("Resume Prep", "10 mentors available"))
        services.add(ViewHolderItems.oneService("Portfolio Review" , "12 mentors available"))
        services.add(ViewHolderItems.oneService("Career Coaching" , "14 mentors available"))
        services.add(ViewHolderItems.oneService("Case Study Design" , "15 mentors available"))
        AlbumList.add(ViewHolderItems.Service("Add your visual album",services))
        return services

    }
    private fun createAlbum3(): MutableList<ViewHolderItems.oneService>{
        var services = mutableListOf<ViewHolderItems.oneService>()
        services.add(ViewHolderItems.oneService("Resume Prep", "10 mentors available"))
        services.add(ViewHolderItems.oneService("Portfolio Review" , "12 mentors available"))
        services.add(ViewHolderItems.oneService("Career Coaching" , "14 mentors available"))
        services.add(ViewHolderItems.oneService("Case Study Design" , "15 mentors available"))
        AlbumList.add(ViewHolderItems.Service("Add your visual album",services))
        return services

    }


}