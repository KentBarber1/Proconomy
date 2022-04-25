package com.example.proconomyapp.viewHolder

import android.graphics.drawable.Drawable
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.proconomyapp.R


class mentorVH(itemView: View):RecyclerView.ViewHolder(itemView) {
    private val name:TextView = itemView.findViewById<TextView>(R.id.name)
    private val availa: TextView = itemView.findViewById<TextView>(R.id.avail)
    private val howmuch: TextView = itemView.findViewById<TextView>(R.id.cost)
    private val brief: TextView = itemView.findViewById<TextView>(R.id.des)
    private val stars: ImageView = itemView.findViewById<ImageView>(R.id.star)
    private val numrates: TextView=itemView.findViewById<TextView>(R.id.textView26)
    private val mentorPic: ImageView=itemView.findViewById<ImageView>(R.id.menPic)
    fun onclick(position:Int,listener: mentorAdapter.OnPicListener){
        mentorPic.setOnClickListener{
             listener.onPicListener(position)
        }
    }
    fun bind(mentor:ViewHolderItems.mentor){
        name.text = mentor.nameTitle
        availa.text = mentor.availability
        howmuch.text = mentor.cost
        brief.text = mentor.description
        if (mentor.online) {
            stars.setImageResource(R.drawable.ic_online)
        }
        when (mentor.rating) {
            0 -> {
                stars.setImageResource(R.drawable.ic_group_zero_star)
            }
            1 -> {
                stars.setImageResource(R.drawable.ic_group_1star)
            }
            2 -> {
                stars.setImageResource(R.drawable.ic_group_2star)
            }
            3 -> {
                stars.setImageResource(R.drawable.ic_3stars)
            }
            4 -> {
                stars.setImageResource(R.drawable.ic__star)
            }
            5 -> {
                stars.setImageResource(R.drawable.ic_group_5stars)
            }
        }
        numrates.text = mentor.numRates


    }

}