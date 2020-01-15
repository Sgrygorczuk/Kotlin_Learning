package com.example.recyclerviewtext.models

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtext.R
import kotlinx.android.synthetic.main.history_layout.view.*


class HistoryRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    //Holds a list of all of the HistoryEntry Objects
    private var items: List<HistoryEntry> = ArrayList()

    //Brings up the set up View
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return HistoryViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.history_layout, parent, false))
    }

    //Picks which viewholder to display
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            //When we want the History view, look at the view from items at current position
            is HistoryViewHolder ->{ holder.bind(items[position]) }
        }
    }

    //Returns the size of the array
    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(historyList : List<HistoryEntry>){
        items = historyList
    }
}

//This is a class that describe the layout
class HistoryViewHolder constructor(itemView : View): RecyclerView.ViewHolder(itemView){
    //Connects the variables to the components on the layout
    var inputText = itemView.inputButton
    var resultText = itemView.resultButton

    //Connects those layout compoents to the datasource
    fun bind(histroyEntry : HistoryEntry){
        inputText.text = histroyEntry.input
        resultText.text = histroyEntry.result
    }
}