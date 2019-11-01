package com.example.firstgame

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        //When linking a button first go to the content_main.xml
        //Select the buttton you want to connect
        //Look at the attributes table and give it and Id
        //Start typing it in when it auto completes select that and it will auto import necessary libaries\
        //Next use a function of the button that listens for a click, insite we can define what it should do when
            //it dectects a click
        bigButton.setOnClickListener {
            println("Sebastian button was clicked")
            //To make the button go to a diffrent screen you use the startAcitvity
            //Have the intnent auto complete to so include the package and then specify the class you want
                //to use as the new screen
            startActivity(Intent(this, AboutMe::class.java))
       }
    }
}
