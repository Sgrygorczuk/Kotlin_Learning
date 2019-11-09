package com.example.currencyconvertor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_main.*
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    //The conversion function takes in a double which is the dollar value
    //and returns a double which is the pound double up to 2 decimal places
    private fun conversion(dollar : Double) : Double{
        return "%.2f".format(dollar * 0.782779).toDouble()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //We have a listen to see if anyone is clicking on the button
        convertButton.setOnClickListener {
            //Send debugger message
            d("Admin", "MainActivity -> converterButton Clicked")
            //First checks if the value input inside of the text box is a double, if not nothing happens
            if(cashInputTextBox.text.toString().toDoubleOrNull() is Double)
            {
                //If the input text is a double it will run the conversion function which changes dollar value to pound value
                val pounds : Double = conversion(cashInputTextBox.text.toString().toDouble())
                //Displays a toast which shows the orignal value to the converted value 
                Toast.makeText(this, "$${cashInputTextBox.text.toString()} converts to £$pounds", Toast.LENGTH_SHORT).show()
            }
        }

        //We have a listener just to check if the TextBox is working correctly when clicked on
        cashInputTextBox.setOnClickListener {
            //Sends debugger message
            d("Admin", "MainActivity -> setOnClickListener Clicked")
        }
    }
}
