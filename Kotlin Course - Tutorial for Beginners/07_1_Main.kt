/*
Tutorial from  freeCodeCamp.org
Kotlin Course - Tutorial for Beginners
https://www.youtube.com/watch?v=F9UC9DY-vIU

Invokes the Person Class 
 */


fun main() {
    //Creates and object of the class Person
    //The secondary consturctor won't run beacue we've defined the values in primary
    val person = Person("Sebastian", "Grygorczuk")
    //This time te seoncdary consturcotr is ran
    //All of the inits will execute befroe the seconadry constructor
    //Or will use deafult values
    val secondPerson = Person()
    //We are able to get access to those variables using '.' operator
    println(person.nickname)
    //We can assign items to var properties of the class
    person.nickname = "Lego Man"
    person.nickname = "Death-o-Man"
    person.printInfo()
}
