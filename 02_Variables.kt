/*
First Program using tutorial from  freeCodeCamp.org
Kotlin Course - Tutorial for Beginners
https://www.youtube.com/watch?v=F9UC9DY-vIU
 */


//You can have global variables in Kotlin where they can be used anywhere unlike local variables
//Which are defined inside the functions
val world: String = "World"

fun main() {
    //You can create a static variable using val
    //Then you define the name of the variable, in this case, it's variableName
    //After that, you put ':' and define what type of variable it is, in this case, String
    //Lastly you can initialize the variable to something
    val variableName: String = "Hello"

    //Kotlin has not nullable string, meaning that if we define a normal variable as String
    //It will not be able to hold the assignment of null thus this has to be initialized at some point if we want to use it
    var notNullableName: String

    //Rather you need to specify a proper type of string that has such functionality
    //You do that by adding a '?' after the data type such that var nullableName: String? = null

    //Kotlin can find out what type of data type you're trying to use even if you don't specify
    var undefined = "Sucker"

    //On the other hand you have var which can be reassigned multiple times after creation
    //var dataName: int = 5
    //dataName = dataName + 10

    //You can combine strings using + operator
    println(variableName + " " +world)
    //Not intilzed can't print yet println(notNullableName)
    notNullableName = "Hi"
    println(notNullableName)
    //Even the nullableName String cannot be pritned unitlizited
    println(nullableName)
    println(undefined)
}
