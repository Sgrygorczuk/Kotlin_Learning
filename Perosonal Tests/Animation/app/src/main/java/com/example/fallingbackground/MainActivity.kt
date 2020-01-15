package com.example.fallingbackground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var pikaBool : Boolean = false

        fun restartImage(){
            pikaImage1.animate()
                .scaleX(1F)
                .scaleY(1F)
                .translationY(0F)
                .duration = 0
        }

        button.setOnClickListener {
                    d("Admin", "Start clicked")
                    if (!pikaBool) {
                        try {
                            pikaImage1.animate()
                                .scaleX(0F)
                                .scaleY(0F)
                                .translationY(2000F)
                                .duration = 1000
                            pikaBool = true
                            Thread.sleep(1000)
                        } catch (e: InterruptedException) {
                            e.printStackTrace()
                        }
                    } else {
                        try {
                            pikaImage1.animate()
                                .scaleX(1F)
                                .scaleY(1F)
                                .translationY(-500F)
                                .duration = 0
                            pikaBool = false
                            Thread.sleep(1000)
                        } catch (e: InterruptedException) {
                            e.printStackTrace()
                        }
                    }
        }
    }
}
