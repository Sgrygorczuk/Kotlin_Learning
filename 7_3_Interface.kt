/*
Tutorial from  freeCodeCamp.org
Kotlin Course - Tutorial for Beginners
https://www.youtube.com/watch?v=F9UC9DY-vIU
 */

//⌨️ (1:43:07) Object Expressions <- Next 

//Interface is a blueprint where you can create all of your functions
//You wish to use in a class
interface PersonInfoProvider {
    //They cna have variables and functions
    //Variables cannot be defined in a Iterface
    val proivderInfo : String
    fun printInfo(person: Person){
        println("PersonInfoProvider")
        person.printInfo()
    }
}

interface SessionInfoProivder{
    fun getSessionId(): String
}

//A class that references that interface
class BasicInfoProvider : PersonInfoProvider{
    //You need to overwrite the getter for variables
    override val proivderInfo: String
        get() = "Provider"
    //The override keyword is necessary in case you have
    //The interface one way the override lets us have
    //A varriation on the function in this specific class
    override fun printInfo(person: Person) {
        println("BasicInfoProvider")
        person.printInfo()
    }
}

class SecondInfoProvider : PersonInfoProvider {
    //You need to overwrite the getter for variables
    override val proivderInfo: String
        get() = "Provider"
}

//You can have multiple interfaces be used by a class
class ThirdInfoProvider : PersonInfoProvider, SessionInfoProivder{
    override val proivderInfo: String
        get() = "Provider"

    override fun getSessionId(): String {
        return "Sessoin"
    }
}

//For a class to be able to give inheritance it needs the open keyword
open class FourthInfoProivder : PersonInfoProvider, SessionInfoProivder{
    //If you want to have a property be able to be changed by the child class it also needs to be marked as open
    //Also set to protected so only parent and child classes have access to it
    protected  open val sessionPrefix = "Session" //Can be changed by child
    val session = "Nevermind" //Cannot

    override val proivderInfo: String
        get() = "Provider"

    override fun printInfo(person: Person) {
        println("BasicInfoProvider")
        person.printInfo()
    }

    override fun getSessionId(): String {
        return sessionPrefix
    }
}

fun main(){
    //This one uses the class printInfo
    val provider = BasicInfoProvider()
    provider.printInfo(Person())
    //This one uses the Interface printInfo
    val secondProvider = SecondInfoProvider()
    secondProvider.printInfo(Person())
    val thirdProvider = ThirdInfoProvider()
    println(thirdProvider.getSessionId())
    //Checks if the object of the class is using
    //A sepcfic interface
    checkTypes(provider) //Is not
    checkTypes(thirdProvider) //Is
    //Uses th FourthInfoProivder function but with the FancyInfoProivder implemnation
    val fourthProvider = FancyInfoProvider()
    println(fourthProvider.proivderInfo)
    fourthProvider.printInfo(Person("Tommy","Hillfinger"))

}

//Checks if object is part of the interface
fun checkTypes(infoProvider: PersonInfoProvider){
    //Can inverse if you do !is
    if(infoProvider is SessionInfoProivder){
        println("Is a session info Provider")
        //Casting if it is part of that interface
        //Alows us to use other interace functions
        (infoProvider as SessionInfoProivder).getSessionId()
        //Kotlin has smart casting where if the object odesnt change you can get it instnatly
        infoProvider.getSessionId()
    }
    else{
        println("Is not")
    }
}

