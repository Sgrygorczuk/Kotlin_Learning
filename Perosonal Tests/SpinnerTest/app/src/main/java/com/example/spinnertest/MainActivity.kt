package com.example.spinnertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.demo_spinner.*

class MainActivity : AppCompatActivity() {

    var oldPostion: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val visiblility = listOf(mood(VISIBLE, "Angry", "#00C604"), mood(GONE, "Happy", "#FFFFFF"),
            mood(GONE, "Playful", "#FFFFFF"), mood(GONE, "Wondering", "#FFFFFF"))

        moodSpinner.adapter = MoodArrayAdapter(this, visiblility)

        moodSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                view?.setBackgroundResource(R.drawable.unpressed)

                visiblility[oldPostion].color = "#FFFFFF"
                visiblility[oldPostion].visiblity = GONE

                visiblility[position].color = "#00C604"
                visiblility[position].visiblity = VISIBLE

                oldPostion = position
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

    }
}

/*
        /*
        Top Area Spinner
         */
        val areaTop = ArrayAdapter(this, android.R.layout.simple_spinner_item, areaTypes)
        areaTop.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        topSpinnerArea!!.adapter = areaTop

        topSpinnerArea.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                topTextViewArea.text = areaUnits[position]
                currentPositionsSpinner[0] = position
                passToLogic()
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
 */