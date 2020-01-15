package com.example.androidrecyclerviewtutorialwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

/*
We start off with adding a API key for the NASA api by saving it in the strings.xml file
*/


class MainActivity : AppCompatActivity() {

    private lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayoutManager
    }
}
