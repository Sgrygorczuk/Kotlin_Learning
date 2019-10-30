/*
Tutorial from  freeCodeCamp.org
Kotlin Course - Tutorial for Beginners
https://www.youtube.com/watch?v=F9UC9DY-vIU
 */

/*Examples of Initialization
class Person(_firstname: String, _lastname: String){
    //We can inistatly intlize the variables here
    val firstname: String = _firstname
    val lastname: String = _lastname
}

class Person(_firstname: String, _lastname: String){
    //Initialization block that will set up the object
    init {
        firstname = _firstname
        lastname = _lastname
    }
}

//In this method, we create the variables firstname and lastname
//And initialize them without having to do that in the body
class Person(val firstname: String, val lastname: String){

    init {
        println("init 1")
    }
    //We can have multiple constructior
    //this refers to the primary consturction which has to sadify all of the parameters it takes
    constructor(): this("Peter", "Parker"){
        println("Secondary constructor")
    }

    init {
        println("init 2")
    }
}
*/

//Everything is defined as the public at the start
//The four states that class properties can be are
    //Public - any user can use it
    //Internal - public within a single project module
    //private which makes it confined this file only
    //Protected make it only work in this class or subclass

//We don't need a secondary constuctor beacue we can set deafult input in the primary constructor
class Person(val firstname: String = "Peter", val lastname: String = "Parker"){

    //We can have other properties in a class
    var nickname: String? = null
        //You can add to the set function whenever a value of it is changed this gets auto attached to the nickname when declared under it
        set(value) {
            field = value //This upadate the value of nickname
            println("New nickanme = $value")
        }
        //Similary works, no value to save so no argument for it
        get() {
            println("Nicknanme = $field")
            return  field
        }

    fun printInfo(){
        //Checks if the nickname is null or not and gives approtate output
        val nicknamePrinted = if(nickname != null) nickname else ""
        //Beacue these binary choices are common there is a specific synaxt to deal with them
        //Both statments are equvilent, checks if the first input is not null (Speciafically does nickname != null)
        val newNickname = nickname ?: ""
        println("$firstname ($nicknamePrinted) $lastname")
    }

}

