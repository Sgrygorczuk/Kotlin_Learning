/*
Tutorial from  freeCodeCamp.org
Kotlin Course - Tutorial for Beginners
https://www.youtube.com/watch?v=F9UC9DY-vIU
 */

fun example(firstname:String, email:List<String>) {
    email.forEach {mail ->
        println("$firstname has email $mail")
    }
}

//What we changed here is we made the email parameter into vararg
//Which makes it an array based on any inputs made after passing in firstname
fun exampleTwo(firstname:String, vararg email:String) {
    email.forEach {mail ->
        println("$firstname has email $mail")
    }
}

//We can have deafult paremter values in case none are given
fun exampleThree(firstname:String = "John", lastname:String = "Doe") {
    println("$firstname $lastname")
}

fun main() {
    val emails = arrayOf("a@aol.com", "b@gmail.com", "c@yahoo.com")

    //Sometimes we don't have a thing to send out to the function
    //But it requires input and sending an empty list like done below is silly
    example("Sebastian", listOf())

    //We can send nothing as input for email
    exampleTwo("Sebastian") //Nothing prints out for this because it's reliant on the array being at least size 1
    //You will not be able to send in the list in this format exampleTwo("Sebastian", email)
    //To be able to pass an array you need to indicate that you want to spread the elements of it using *
    exampleTwo("Sebastian", *emails)
    //Instead you can add how many String items you want and they will all be grouped into an array
    exampleTwo("Sebastian","k@me.com", "g@you.com", "t@them.com" )

    //For clarities sake we can define what parameters take in what input
    exampleThree(firstname =  "Sebastian", lastname = "Grygorczuk")
    //This also allows us to chagne the order in which we put the paramteters in
    exampleThree(lastname = "Grygorczuk", firstname =  "Sebastian")
    //A limitation of this is that once you name one argument you have to name all of them
    //exampleThree(firstname =  "Grygorczuk",  "Sebastian") This is not allowed 
    //With deafult values we don't have to pass any values and just use the ones that were predestined
    exampleThree()
}

