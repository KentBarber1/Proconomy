package com.example.proconomyapp.viewHolder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proconomyapp.R

class mentorAdapter:RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var items = listOf<ViewHolderItems>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.one_mentor_pro,parent,false)
        return mentorVH(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is mentorVH -> holder.bind(items[position] as ViewHolderItems.mentor)
        }
        when (holder){
            is mentorVH -> holder.onclick(position,mListener)
        }


    }

    override fun getItemCount() = items.size
     private lateinit var mListener: OnPicListener
    interface OnPicListener{
        fun onPicListener(position: Int)
    }
    fun setOnPicClickListner(listener: OnPicListener){
        mListener = listener
    }

}