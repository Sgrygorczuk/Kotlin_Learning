package com.example.calculator

import android.graphics.Color
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainLogic {
    var inputOne : String = ""
    var inputTwo : String = ""
    var operation : String = ""
    var inputString : String = ""
    var resultString : String = ""
    var operationPerformed : Boolean = false


    fun performOperation() : String {
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
            return resultString
        }
        else return ""
    }

    fun performEqual() : String {
        if ((inputOne.toDoubleOrNull() is Double) && (inputTwo.toDoubleOrNull() is Double)
            && (inputOne != "") && operationPerformed == false) {
            inputTwo = ""
            inputOne = resultString
            operation = ""
            operationPerformed = true
        }
        return resultString
    }

    //The addChar function updates the textView with whatever
    fun addChar(choice: String) : String {
        var returnInfo = mutableListOf("", "", "")
        //Checks if a operation has been perfromed recently
        //If it has we will wipe the current number from screen and replace it
        if(inputString.length != 9){ //Then list all the possiblites and their results using the ->//calculatorView.setTextColor(Color.parseColor("#FFFFFF"))
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
            inputString = inputTwo + operation + inputOne
        }
        return inputString
    }

    fun isMaxLenght() : Boolean { return inputString.length == 9 }

    fun clear() : Unit{
        inputOne = ""
        inputTwo = ""
        operation = ""
        inputString = ""
    }

    fun operationWasPerformed() : String {
        inputOne = ""
        operationPerformed = false
        return "#FFFFFF"
    }

    fun operationSetUp(choice : String) : String{
        if(operation != ""){ inputOne = performOperation()}
        inputTwo = inputOne
        inputOne = ""
        if(inputString.length != 0) {
            when (choice) {
                "/" -> operation = "/"
                "*" -> operation = "*"
                "-" -> operation = "-"
                "+" -> operation = "+"

            }
        }
        inputString = inputTwo + operation + inputOne
        return inputString
    }

    fun negation() : String {
        if(inputOne.contains('-')) inputOne = inputOne.replace("-", "")
        else inputOne = "-$inputOne"
        inputString = inputTwo + operation + inputOne
        return inputString

    }
}