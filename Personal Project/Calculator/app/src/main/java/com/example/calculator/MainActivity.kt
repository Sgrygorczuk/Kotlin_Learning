package com.example.calculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.sqrt
import java.math.BigDecimal
import java.text.DecimalFormat
import kotlin.math.truncate

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var inputOne : String = ""
        var inputTwo : String = ""
        var operation : String = ""
        var inputString : String = ""
        var resultString : String = ""
        var operationPerformed : Boolean = false


        fun performOperation() {
            if ((inputOne.toDoubleOrNull() is Double) && (inputTwo.toDoubleOrNull() is Double)
            && (inputOne != "")){
                when (operation) {
                    //Then list all the possiblites and their results using the ->
                    "/" -> resultString = (inputTwo.toDouble() / inputOne.toDouble()).toString()
                    "*" -> resultString = (inputTwo.toDouble() * inputOne.toDouble()).toString()
                    "-" -> resultString = (inputTwo.toDouble() - inputOne.toDouble()).toString()
                    "+" -> resultString = (inputTwo.toDouble() + inputOne.toDouble()).toString()
                    else -> null
                }
                resultsView.text = resultString
            }
            else resultsView.text = ""
        }

        fun performEqual(){
            if ((inputOne.toDoubleOrNull() is Double) && (inputTwo.toDoubleOrNull() is Double)
                && (inputOne != "")) {
                inputTwo = ""
                inputOne = resultString
                operation = ""
                operationPerformed = true
                resultsView.text = ""
                calculatorView.setTextColor(Color.parseColor("#36C23B"))
                calculatorView.text = resultString
            }
        }

        //The addChar function updates the textView with whatever
        fun addChar(choice: String) : Unit {
            //Checks if a operation has been perfromed recently
            //If it has we will wipe the current number from screen and replace it
            if(inputString.length == 9) {
                Toast.makeText(this, "You can have a max of 9 characters", Toast.LENGTH_SHORT).show()
            }
                else {
                    if (operationPerformed) {
                        inputOne = ""
                        operationPerformed = false
                        calculatorView.setTextColor(Color.parseColor("#FFFFFF"))
                    }
                    when (choice) {
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
                        "." -> if (inputOne == "") inputOne += "0." else inputOne += "."
                        else -> null
                    }
                    performOperation()
                    inputString = inputTwo + operation + inputOne
                    calculatorView.text = inputString
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
            inputString = ""
            performOperation()
            calculatorView.text = inputString
        }

        //Operation Buttons
        divButton.setOnClickListener {
            d("Admin", "MainActivity: divButton was clicked")
            inputTwo = inputOne
            inputOne = ""
            operation = "/"
            performOperation()
            inputString = inputTwo + operation + inputOne
            calculatorView.text = inputString
        }

        timesButton.setOnClickListener {
            d("Admin", "MainActivity: timesButton was clicked")
            inputTwo = inputOne
            inputOne = ""
            operation = "*"
            performOperation()
            inputString = inputTwo + operation + inputOne
            calculatorView.text = inputString
        }

        minusButton.setOnClickListener {
            d("Admin", "MainActivity: minusButton was clicked")
            inputTwo = inputOne
            inputOne = ""
            operation = "-"
            performOperation()
            inputString = inputTwo + operation + inputOne
            calculatorView.text = inputString
        }

        plusButton.setOnClickListener {
            d("Admin", "MainActivity: divButton was clicked")
            inputTwo = inputOne
            inputOne = ""
            operation = "+"
            performOperation()
            inputString = inputTwo + operation + inputOne
            calculatorView.text = inputString
        }

        equalButton.setOnClickListener {
            d("Admin", "MainActivity: divButton was clicked")
            performEqual()
        }

        //Operation on inputOne only
        radButton.setOnClickListener {
            d("Admin", "MainActivity: radButton was clicked")
            if(inputOne.toDoubleOrNull() is Double){
                    inputOne = (sqrt(inputOne.toDouble())).toString()
                    operationPerformed = true
                    calculatorView.text = inputOne
                }
        }

        negButton.setOnClickListener {
            d("Admin", "MainActivity: negButton was clicked")
            if(inputOne.contains('-')) inputOne = inputOne.replace("-", "")
            else inputOne = "-$inputOne"
            performOperation()
            inputString = inputTwo + operation + inputOne
            calculatorView.text = inputString
        }


    }
}
