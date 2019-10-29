/*
First Program using tutorial from  freeCodeCamp.org
Kotlin Course - Tutorial for Beginners
https://www.youtube.com/watch?v=F9UC9DY-vIU
 */

//When inilizing a function you type in fun, name(paraimters): return variable type
fun getGreeting(): String
{
    return "Hello Kotlin\n"
}

//Unit is void
fun voidfunction(): Unit
{
    println("Hello from the void")
}

//When defining the input parameters you have to define their types
fun withParameters(inputVar: String): String {
    if (inputVar == "Sebastian") {
        return "Hello " + inputVar

    }
    else
    {
        //Kotlin allows us to combine Strings without using the +
        //But instead using the $ in the string followed by the vaiable stirng
        return "Hello $inputVar"
    }
}
fun main() {
    var greetings: String = getGreeting()
    print(greetings)
    voidfunction()
    println(withParameters("Sebastian"))
    println(withParameters("Irina"))
}

