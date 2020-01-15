package com.example.androidrecyclerviewtutorialwithkotlin

import android.provider.ContactsContract
import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private val photos: ArrayList<Photo>) : RecyclerView.Adapter<RecyclerAdapter.PhotoHolder>()  {
   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.PhotoHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount() = photos.size

    override fun onBindViewHolder(holder: RecyclerAdapter.PhotoHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

//1
class PhotoHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
    //2
    private var view: View = v
    private var photo: Photo? = null

    //3
    init {
        v.setOnClickListener(this)
    }

    //4
    override fun onClick(v: View) {
        Log.d("RecyclerView", "CLICK!")
    }

    companion object {
        //5
        private val PHOTO_KEY = "PHOTO"
    }
}
