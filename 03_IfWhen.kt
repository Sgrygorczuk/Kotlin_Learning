/*
First Program using tutorial from  freeCodeCamp.org
Kotlin Course - Tutorial for Beginners
https://www.youtube.com/watch?v=F9UC9DY-vIU
 */


val world: String = "World"

fun main() {
    var doughnuts: String = "Fluffy"
    //You define an if statment with if() and use {} to define the body of the stamtent
    if(world != null)
    {
        println(world)
    }
    //Else statment works same as always
    else
    {
        println("NEVER")
    }

    //Kotlin also has an When statement that works like a Case statement
    //You put in whatever variable you're testing into the ()
    when(world)
    {
        //Then list all the possiblites and their results using the ->
        null -> println("Hi")
        "World" -> println("Not World")
        else ->  println("Wheeeeeeeeeee")
    }


    //You can use them if and when statements during assignments of variables
    //Here we provide an if statement that checks the status of the world variables
    //and then assigns the assignedVar a different string depending on the world variable
    var assginedVar = if(world == "hi") "Peter Pan" else "Kotlin"
    println(assginedVar)

    //Similarly we can do this using the when statement, here I used a static input of the when statement
    var whenVar = when(null)
    {
        null -> "Hi"
        "World" -> "Not World"
        else ->  "Wheeeeeeeeeee"
    }

    println(whenVar)
}
