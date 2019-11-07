package com.examplefriendView.projectthree

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projectthree.R

class FriendsAdapter : RecyclerView.Adapter<FriendsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //No idea                                                       //How it will display?
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_friend, parent, false)
        return ViewHolder(view)
    }

    //Usually you would make it into a function but for example purpse we can just have a max of 100 items
    override fun getItemCount() = 100

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    //Grabs a class that already deals with dispalying data
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

}
