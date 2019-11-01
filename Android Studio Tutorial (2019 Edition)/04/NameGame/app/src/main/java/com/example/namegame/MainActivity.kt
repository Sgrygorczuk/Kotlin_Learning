package com.example.namegame

import android.os.Bundle
import android.util.Log.d
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

        bigButton.setOnClickListener {
            //The ${editText.text} will print out hte value of whatever the user typed out in the Text Box
            //editText is the id of the textbox
            d("Sebastian","Button was Clicked and it will print Hello ${editText.text}")
            //You do textBox id .text = Whatever text you want
            textOutput.text = "Hello ${editText.text}"
        }
    }
}
