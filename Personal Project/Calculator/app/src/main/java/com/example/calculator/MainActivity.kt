package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.sqrt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var inputOne : String = ""
        var inputTwo : String = ""
        var operation : String = ""
        var operationPerformed : Boolean = false

        //The addChar function updates the textView with whatever
        fun addChar(choice: String) : Unit {
            //Checks if a operation has been perfromed recently
            //If it has we will wipe the current number from screen and replace it
            if(operationPerformed){
                inputOne = ""
                operationPerformed = false
            }
            when(choice)
            {
                //Then list all the possiblites and their results using the ->
                "0" -> inputOne += "0"
                "1" -> inputOne += "1"
                "2" -> inputOne += "2"
                "3" -> inputOne += "3"
                "4" -> inputOne += "4"
                "5" -> inputOne += "5"
                "6" -> inputOne += "6"
                "7" -> inputOne += "7"
                "8" -> inputOne += "8"
                "9" -> inputOne += "9"
                "." -> if(inputOne == "") inputOne += "0." else inputOne +=  "."
                else ->  null
            }
            calculatorView.text = inputOne
        }

        fun performOperation(){
            if((inputOne.toDoubleOrNull() is Double) && (inputTwo.toDoubleOrNull() is Double)){
                when(operation)
                {
                    //Then list all the possiblites and their results using the ->
                    "0" -> inputOne = (inputTwo.toDouble() / inputOne.toDouble()).toString()
                    "1" -> inputOne = (inputTwo.toDouble() * inputOne.toDouble()).toString()
                    "2" -> inputOne = (inputTwo.toDouble() - inputOne.toDouble()).toString()
                    "3" -> inputOne = (inputTwo.toDouble() + inputOne.toDouble()).toString()
                    else ->  null
                }
                if(inputOne.toIntOrNull() is Int) inputOne = inputOne.toInt().toString()
                inputTwo = ""
                operation = ""
                operationPerformed = true
                calculatorView.text = inputOne
            }
        }

        //The string forming buttons
        //Clicking these buttons will lead to updating the current value of the string
        nineButton.setOnClickListener {
            d("Admin", "MainActivity: nineButton was clicked")
            addChar("9")
        }

        eightButton.setOnClickListener {
            d("Admin", "MainActivity: eightButton was clicked")
            addChar("8")
        }

        sevenButton.setOnClickListener {
            d("Admin", "MainActivity: sevenButton was clicked")
            addChar("7")
        }

        sixButton.setOnClickListener {
            d("Admin", "MainActivity: sixButton was clicked")
            addChar("6")
        }

        fiveButton.setOnClickListener {
            d("Admin", "MainActivity: fiveButton was clicked")
            addChar("5")
        }

        fourButton.setOnClickListener {
            d("Admin", "MainActivity: fourButton was clicked")
            addChar("4")
        }

        threeButton.setOnClickListener {
            d("Admin", "MainActivity: threeButton was clicked")
            addChar("3")
        }

        twoButton.setOnClickListener {
            d("Admin", "MainActivity: twoButton was clicked")
            addChar("2")
        }

        oneButton.setOnClickListener {
            d("Admin", "MainActivity: oneButton was clicked")
            addChar("1")
        }

        zeroButton.setOnClickListener {
            d("Admin", "MainActivity: zeroButton was clicked")
            addChar("0")
        }

        decimalButton.setOnClickListener {
            d("Admin", "MainActivity: decimalButton was clicked")
            addChar(".")
        }

        //Clear Function
        clearButton.setOnClickListener {
            d("Admin", "MainActivity: clearButton was clicked")
            inputOne = ""
            inputTwo = ""
            operation = ""
            calculatorView.text = inputOne
        }

        //Operation Buttons
        divButton.setOnClickListener {
            d("Admin", "MainActivity: divButton was clicked")
            inputTwo = inputOne
            inputOne = ""
            operation = "0"
        }

        timesButton.setOnClickListener {
            d("Admin", "MainActivity: timesButton was clicked")
            inputTwo = inputOne
            inputOne = ""
            operation = "1"
        }

        minusButton.setOnClickListener {
            d("Admin", "MainActivity: minusButton was clicked")
            inputTwo = inputOne
            inputOne = ""
            operation = "2"
        }

        plusButton.setOnClickListener {
            d("Admin", "MainActivity: divButton was clicked")
            inputTwo = inputOne
            inputOne = ""
            operation = "3"
        }

        equalButton.setOnClickListener {
            d("Admin", "MainActivity: divButton was clicked")
            performOperation()
        }

        //Operation on inputOne only
        radButton.setOnClickListener {
            d("Admin", "MainActivity: radButton was clicked")
            inputOne = (sqrt(inputOne.toDouble())).toString()
            operationPerformed = true
            calculatorView.text = inputOne
        }

        negButton.setOnClickListener {
            d("Admin", "MainActivity: negButton was clicked")
            if(inputOne.contains('-'))  inputOne = inputOne.replace("-", "")
            else inputOne = "-$inputOne"
            calculatorView.text = inputOne
        }


    }
}
