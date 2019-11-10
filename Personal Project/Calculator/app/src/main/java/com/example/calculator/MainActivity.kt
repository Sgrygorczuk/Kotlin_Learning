package com.example.calculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.sqrt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logicUnit = MainLogic()

        //The string forming buttons
        //Clicking these buttons will lead to updating the current value of the string
        nineButton.setOnClickListener {
            d("Admin", "MainActivity: nineButton was clicked")
            if(logicUnit.isMaxLenght()) Toast.makeText(this, "Max Input of 9", Toast.LENGTH_SHORT).show()
            calculatorView.setTextColor(Color.parseColor(logicUnit.operationWasPerformed()))
            calculatorView.text = logicUnit.addChar("9")
            resultsView.text = logicUnit.performOperation()
        }

        eightButton.setOnClickListener {
            d("Admin", "MainActivity: eightButton was clicked")
            if(logicUnit.isMaxLenght()) Toast.makeText(this, "Max Input of 9", Toast.LENGTH_SHORT).show()
            calculatorView.setTextColor(Color.parseColor(logicUnit.operationWasPerformed()))
            calculatorView.text = logicUnit.addChar("8")
            resultsView.text = logicUnit.performOperation()
        }

        sevenButton.setOnClickListener {
            d("Admin", "MainActivity: sevenButton was clicked")
            if(logicUnit.isMaxLenght()) Toast.makeText(this, "Max Input of 9", Toast.LENGTH_SHORT).show()
            calculatorView.setTextColor(Color.parseColor(logicUnit.operationWasPerformed()))
            calculatorView.text = logicUnit.addChar("7")
            resultsView.text = logicUnit.performOperation()
        }

        sixButton.setOnClickListener {
            d("Admin", "MainActivity: sixButton was clicked")
            if(logicUnit.isMaxLenght()) Toast.makeText(this, "Max Input of 9", Toast.LENGTH_SHORT).show()
            calculatorView.setTextColor(Color.parseColor(logicUnit.operationWasPerformed()))
            calculatorView.text = logicUnit.addChar("6")
            resultsView.text = logicUnit.performOperation()
        }

        fiveButton.setOnClickListener {
            d("Admin", "MainActivity: fiveButton was clicked")
            if(logicUnit.isMaxLenght()) Toast.makeText(this, "Max Input of 9", Toast.LENGTH_SHORT).show()
            calculatorView.setTextColor(Color.parseColor(logicUnit.operationWasPerformed()))
            calculatorView.text = logicUnit.addChar("5")
            resultsView.text = logicUnit.performOperation()
        }

        fourButton.setOnClickListener {
            d("Admin", "MainActivity: fourButton was clicked")
            if(logicUnit.isMaxLenght()) Toast.makeText(this, "Max Input of 9", Toast.LENGTH_SHORT).show()
            calculatorView.setTextColor(Color.parseColor(logicUnit.operationWasPerformed()))
            calculatorView.text = logicUnit.addChar("4")
            resultsView.text = logicUnit.performOperation()
        }

        threeButton.setOnClickListener {
            d("Admin", "MainActivity: threeButton was clicked")
            if(logicUnit.isMaxLenght()) Toast.makeText(this, "Max Input of 9", Toast.LENGTH_SHORT).show()
            calculatorView.setTextColor(Color.parseColor(logicUnit.operationWasPerformed()))
            calculatorView.text = logicUnit.addChar("3")
            resultsView.text = logicUnit.performOperation()
        }

        twoButton.setOnClickListener {
            d("Admin", "MainActivity: twoButton was clicked")
            if(logicUnit.isMaxLenght()) Toast.makeText(this, "Max Input of 9", Toast.LENGTH_SHORT).show()
            calculatorView.setTextColor(Color.parseColor(logicUnit.operationWasPerformed()))
            calculatorView.text = logicUnit.addChar("2")
            resultsView.text = logicUnit.performOperation()
        }

        oneButton.setOnClickListener {
            d("Admin", "MainActivity: oneButton was clicked")
            if(logicUnit.isMaxLenght()) Toast.makeText(this, "Max Input of 9", Toast.LENGTH_SHORT).show()
            calculatorView.setTextColor(Color.parseColor(logicUnit.operationWasPerformed()))
            calculatorView.text = logicUnit.addChar("1")
            resultsView.text = logicUnit.performOperation()
        }

        zeroButton.setOnClickListener {
            d("Admin", "MainActivity: zeroButton was clicked")
            if(logicUnit.isMaxLenght()) Toast.makeText(this, "Max Input of 9", Toast.LENGTH_SHORT).show()
            calculatorView.setTextColor(Color.parseColor(logicUnit.operationWasPerformed()))
            calculatorView.text = logicUnit.addChar("0")
            resultsView.text = logicUnit.performOperation()
        }

        decimalButton.setOnClickListener {
            d("Admin", "MainActivity: decimalButton was clicked")
            if(logicUnit.isMaxLenght()) Toast.makeText(this, "Max Input of 9", Toast.LENGTH_SHORT).show()
            calculatorView.setTextColor(Color.parseColor(logicUnit.operationWasPerformed()))
            calculatorView.text = logicUnit.addChar(".")
            resultsView.text = logicUnit.performOperation()
        }

        //Clear Function
        clearButton.setOnClickListener {
            d("Admin", "MainActivity: clearButton was clicked")
            logicUnit.clear()
            resultsView.text = logicUnit.performOperation()
            calculatorView.text = ""
        }

        //Operation Buttons
        divButton.setOnClickListener {
            d("Admin", "MainActivity: divButton was clicked")
            calculatorView.setTextColor(Color.parseColor("#FFFFFF"))
            calculatorView.text = logicUnit.operationSetUp("/")
            resultsView.text = logicUnit.performOperation()
        }

        timesButton.setOnClickListener {
            d("Admin", "MainActivity: timesButton was clicked")
            calculatorView.setTextColor(Color.parseColor("#FFFFFF"))
            calculatorView.text = logicUnit.operationSetUp("*")
            resultsView.text = logicUnit.performOperation()
        }

        minusButton.setOnClickListener {
            d("Admin", "MainActivity: minusButton was clicked")
            calculatorView.setTextColor(Color.parseColor("#FFFFFF"))
            calculatorView.text = logicUnit.operationSetUp("-")
            resultsView.text = logicUnit.performOperation()
        }

        plusButton.setOnClickListener {
            d("Admin", "MainActivity: divButton was clicked")
            calculatorView.setTextColor(Color.parseColor("#FFFFFF"))
            calculatorView.text = logicUnit.operationSetUp("+")
            resultsView.text = logicUnit.performOperation()
        }

        equalButton.setOnClickListener {
            d("Admin", "MainActivity: divButton was clicked")
            calculatorView.text =  logicUnit.performEqual()
            resultsView.text = ""
            calculatorView.setTextColor(Color.parseColor("#36C23B"))
        }

        //Operation on inputOne only
        radButton.setOnClickListener {
            d("Admin", "MainActivity: radButton was clicked")
            //if(inputOne.toDoubleOrNull() is Double){
                   // inputOne = (sqrt(inputOne.toDouble())).toString()
                    //operationPerformed = true
                    //calculatorView.text = inputOne
                //}
        }

        negButton.setOnClickListener {
            d("Admin", "MainActivity: negButton was clicked")
            calculatorView.text = logicUnit.negation()
            resultsView.text = logicUnit.performOperation()
        }
    }
}
