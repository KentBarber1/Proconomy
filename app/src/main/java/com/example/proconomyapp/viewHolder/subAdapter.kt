package com.example.proconomyapp.viewHolder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.proconomyapp.R

class subAdapter(private val dataset: List<ViewHolderItems.oneService>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.one_album,parent,false)
        return ViewHolder1(view)
    }


    override fun getItemCount() = dataset.size

    inner class ViewHolder1(view: View) : RecyclerView.ViewHolder(view) {
        val sub1:TextView = view.findViewById(R.id.sub1)
        val sub2:TextView = view.findViewById(R.id.sub2)

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder){
            is ViewHolder1 -> {
                holder.sub1.text = dataset[position].subti1
                holder.sub2.text = dataset[position].subti2
            }

        }

    }
}