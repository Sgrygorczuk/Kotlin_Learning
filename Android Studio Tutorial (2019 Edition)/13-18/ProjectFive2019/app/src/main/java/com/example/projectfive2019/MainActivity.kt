package com.example.projectfive2019

import android.content.Intent
import android.os.Bundle
import android.util.Log.d
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        //A list of users with their naems, emails and photos attacched
        var friendlist = listOf(
            Friend("Gary", "Strew", "me.com", R.drawable.bulba),
            Friend("Harry", "Straw", "you.com", R.drawable.squrt),
            Friend("Jeremy", "Night", ".com", R.drawable.bulba),
            Friend("Elizabeth", "Shaw", "them.com", R.drawable.squrt),
            Friend("Chicekn", "Sew", "meom", R.drawable.bulba)
        )

        mainList.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            //Have a separte class that deals with it (Now we pass the list of friends to this class)
            adapter = ListAdaper(friendlist){
                d("Sebastian","From Friend to MainActivity")
                startActivity(Intent(this@MainActivity,FriendDetails::class.java))
            }
        }
    }
}
