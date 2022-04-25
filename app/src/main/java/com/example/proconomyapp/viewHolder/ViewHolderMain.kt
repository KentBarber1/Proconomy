package com.example.proconomyapp.viewHolder


import android.app.ActionBar
import android.content.Context
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.SearchView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proconomyapp.R


sealed class ViewHolderMain(itemView: View):RecyclerView.ViewHolder(itemView)  {
    class searchVH(itemView: View): ViewHolderMain(itemView){
        val search_Item = itemView.findViewById<SearchView>(R.id.searchBar)

        //val searchView = menu.findItem(R.id.searchBar).getActionView() as SearchView
        fun bind(context: Context){
            //val navButtonsParams = ActionBar.LayoutParams(30, 30)

            //val btnNext = Button(context)
            //btnNext.background = context.getResources().getDrawable(R.drawable.ic_shape)
            //(search_Item.getChildAt(0) as LinearLayout).addView(btnNext, navButtonsParams)
            
        }

    }
    class fieldVH(itemView: View): ViewHolderMain(itemView){

    }
    class serviceVH(itemView: View): ViewHolderMain(itemView){
        var recyclerV:RecyclerView = itemView.findViewById(R.id.serviceRV)
        lateinit var layoutM: LinearLayoutManager
        lateinit var adapter:subAdapter
        fun bind(oneService:ViewHolderItems.Service){
            layoutM = LinearLayoutManager(itemView.getContext(),LinearLayoutManager.HORIZONTAL,false)
            adapter = subAdapter(oneService.services)
            recyclerV.layoutManager = layoutM
            recyclerV.adapter = adapter


        }

    }
    class moreSVH(itemView: View): ViewHolderMain(itemView){
        var oneline: TextView = itemView.findViewById(R.id.smalltext)
        fun bind(texts:ViewHolderItems.otherService){
            oneline.text = texts.ser
        }

    }
}