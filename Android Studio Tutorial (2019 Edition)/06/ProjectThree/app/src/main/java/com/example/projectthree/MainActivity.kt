package com.examplefriendView.projectthree

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projectthree.R

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        //Use the recylcer id .apply to set up the function
        friendRecyclerView.apply {
            //Set up how the data will be organzied
            layoutManager = LinearLayoutManager(this@MainActivity)
            //Set the addaptet to our own custum class
            adapter = FriendsAdapter()
        }
    }
}
