package com.example.proconomyapp.viewHolder

import android.view.LayoutInflater
import android.view.SearchEvent
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proconomyapp.R
import com.facebook.FacebookSdk.getApplicationContext



class mainPageadapter:RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    enum class ViewHolderType{
        SEARCH,SERVICE,FIELD,OSERVICE
    }
    var items = listOf<ViewHolderItems>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType) {
            ViewHolderType.SEARCH.ordinal ->{
                val view = LayoutInflater.from(parent.context).inflate(R.layout.search_bar_part,parent,false)
                return ViewHolderMain.searchVH(view)
            }
            ViewHolderType.SERVICE.ordinal ->{
                val view = LayoutInflater.from(parent.context).inflate(R.layout.service,parent,false)
                return ViewHolderMain.serviceVH(view)
            }
            ViewHolderType.FIELD.ordinal ->{
                val view = LayoutInflater.from(parent.context).inflate(R.layout.single_text,parent,false)
                return ViewHolderMain.fieldVH(view)
            }
            ViewHolderType.OSERVICE.ordinal ->{
                val view = LayoutInflater.from(parent.context).inflate(R.layout.small_text,parent,false)
                return ViewHolderMain.moreSVH(view)
            }
            else -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.search_bar_part,parent,false)
                return ViewHolderMain.searchVH(view)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is ViewHolderMain.serviceVH -> holder.bind(items[position] as ViewHolderItems.Service)
            is ViewHolderMain.moreSVH -> holder.bind(items[position] as ViewHolderItems.otherService)
            is ViewHolderMain.searchVH -> holder.bind(getApplicationContext())
        }


    }

    override fun getItemCount() = items.size

    override fun getItemViewType(position: Int): Int {
        return when(items[position]){
            is ViewHolderItems.Search -> ViewHolderType.SEARCH.ordinal
            is ViewHolderItems.Service -> ViewHolderType.SERVICE.ordinal
            is ViewHolderItems.otherfield -> ViewHolderType.FIELD.ordinal
            is ViewHolderItems.otherService -> ViewHolderType.OSERVICE.ordinal
            else -> ViewHolderType.SEARCH.ordinal
        }
    }

    }
