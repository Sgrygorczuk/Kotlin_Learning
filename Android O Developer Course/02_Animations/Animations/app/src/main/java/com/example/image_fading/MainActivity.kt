package com.example.image_fading

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var pikaState : Boolean = true

    //For images the onClick command is set in the xml file
    fun fadingPikachu (view : View){
        d("Admin", "Pika was clicked")
        if(pikaState){
            //This will animate the image to go to transperancy of 0 in time of 2 sec
            pikaImage.animate()
                .scaleX(0F)
                .scaleY(0F)
                .translationY(-500F)
                .alpha(0F)
                .duration = 1000

            raichuImage.animate()
                .scaleX(1F)
                .scaleY(1F)
                .translationY(0F)
                .alpha(1F)
                .rotation(360F)
                .duration = 2000
            pikaState = false
        }
        else{
            //Setting stuff to 1 and translation to 0 returns it ot normal
            raichuImage.animate()
                .scaleX(0F)
                .scaleY(0F)
                .translationY(-500F)
                .alpha(0F)
                .duration = 1000

            pikaImage.animate()
                .scaleX(1F)
                .scaleY(1F)
                .translationY(0F)
                .rotation(360F)
                .alpha(1F)
                .duration = 2000
            pikaState = true
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
