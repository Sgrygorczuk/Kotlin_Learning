package com.example.firstgame

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

//Extend the AppCompatActivity to allow this class to use Screen Functionality
//If there are lines under the class name click on it, you probably have to add it to the activity
//To do that click on it let the light bulb show up and select add to manifest
//Manifest is a file that keeps track of all of the screens
class AboutMe : AppCompatActivity() {

    //Get the onCreate() that has the Bundle? in it
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        //Add a layout, if you haven't created the layout yet you can click on the name and it will auto
        //Add the xml file
        setContentView(R.layout.activity_about_me)
    }

}
