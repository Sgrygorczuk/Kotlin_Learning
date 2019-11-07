package com.example.projectfour2019

import android.graphics.Color.GRAY
import android.graphics.Color.GREEN
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentManager

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

fun markButtonEnable(button: Button) {
    button.isEnabled = true
    button.setBackgroundColor(GREEN)
}

fun markButtonDisable(button: Button) {
    button.isEnabled = false
    button.setBackgroundColor(GRAY)
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        markButtonDisable(buttonClicker)

        //Lesson #10
        //You can have things happen when you click on text works kind of like a text notifatiction pop up
        textId.setOnClickListener {
            //You make a text appear for a short time
            Toast.makeText(this, "Why you click me?!", Toast.LENGTH_SHORT).show()
        }

        //Lesson #11
        imageView.setOnClickListener {
            //Its like a download notifation that pops up on the bottom of the screen can be swipped away
            //Requres somehting on the screen to attach to
            Snackbar.make(imageView, "Upadte Complete", Snackbar.LENGTH_LONG).show()
        }

        //Lesson #12
        //The switch will listen to if it's flipped and depending on what side it is it will either be on or off
        switch1.setOnCheckedChangeListener { buttonView, isChecked ->
            //If it is on it will make the button clickable and green
            if(isChecked){
                markButtonEnable(buttonClicker)
            }
            //If it is off it will make the button disabled and grey
            else{
                markButtonDisable(buttonClicker)
            }

        //Connects the frame to the logic
        supportFragmentManager.beginTransaction()
            .replace(R.id.ourFrameLayout, FirstFragment())
            .commit()
        }
    }

}
