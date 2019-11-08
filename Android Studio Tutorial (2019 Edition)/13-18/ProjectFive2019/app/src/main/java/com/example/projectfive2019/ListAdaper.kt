package com.example.projectfive2019

import android.os.Build
import android.util.Log.d
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_layout.view.*

class ListAdaper(private val firendList : List <Friend>, val clicked : () -> Unit)
    : RecyclerView.Adapter<ListAdaper.ViewHolder>(){
    //Sets up how it will dispaly each of the rows
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutView = LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false)
        return ViewHolder(layoutView)
    }

    //Gives number of rows, can be a function or just a int
    override fun getItemCount() = 5

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //Will write the bulbaaa and the numebr of the row
        holder.view.bulbaText.text = "Bulbaaaa $position"

        //Chapter15 we can now use info from the class and dispaly it for each diffrent tab
        val friend = firendList[position]
        holder.view.Chapter15.text = "${friend.firstname}  ${friend.lastname}  @ ${friend.email}"
        //Grabs the photo form the object
        holder.view.imageView.setImageDrawable(holder.view.context.getDrawable(friend.photo))

        holder.view.setOnClickListener{
            d("Sebastian","Clicked")
        }
     }

    //Create Class View Holder has a vairable view which is of type View and then we pass that into the ViewHolder
    class ViewHolder(val view : View) : RecyclerView.ViewHolder(view)


}
