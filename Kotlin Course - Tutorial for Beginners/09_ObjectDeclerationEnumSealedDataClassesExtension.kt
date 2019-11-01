/*
Tutorial from  freeCodeCamp.org
Kotlin Course - Tutorial for Beginners
https://www.youtube.com/watch?v=F9UC9DY-vIU
 */


import java.util.*

//Sealed classes can only extend each other and no other class can branch off from them

//Holds types
enum class entityType{
    //Needs a; to set as types
    HELP, EASY, MEDIUM, HARD;

    //A specilized function that will deal with any call to get type name
    fun getFormatedName() = name.toLowerCase().capitalize()
}

object EntityFactory{
    fun create(type: entityType) :Entity{
        //Gets a random number to made id
        val id = UUID.randomUUID().toString()
        //Depedning on what type is passed gives one of three names
        val name = when(type){
            entityType.HELP -> "Help"
            entityType.EASY -> "easy" //You can use either custom
            entityType.MEDIUM -> type.getFormatedName() //Or just grab the class the name directly
            entityType.HARD -> "hard"
        }
        return Entity(id, name)
    }
}

class Entity constructor(val id: String, val name: String){
    override fun toString(): String {
        return "id:$id name:$name"
    }
}

object EntityFactoryTwo{
    fun create(type: entityType) : EntityTwo {
        //Gets a random number to made id
        val id = UUID.randomUUID().toString()
        //Depedning on what type is passed gives one of three names
        val name = when(type){
            entityType.HELP -> "Help"
            entityType.EASY -> "easy"
            entityType.MEDIUM -> type.getFormatedName()
            entityType.HARD -> "hard"
        }
        //Can just return whatever the case
        return when(type){
            entityType.HELP -> EntityTwo.Help //Won't work unless it's extened
            entityType.EASY -> EntityTwo.EASY(id, name)
            entityType.MEDIUM -> EntityTwo.MEDIUM(id, name)
            entityType.HARD -> EntityTwo.HARD(id, name, 1.5f)
        }
    }
}

//You can extend functions and propirties from data classes outside the classs
fun EntityTwo.MEDIUM.printInfo()
{
    println("id:$id")
}

//You can declare a bunch of different classes in a sealed class
sealed class EntityTwo constructor(){
    //You extned by using :
    object Help : EntityTwo() {
        val name: String = "Help"
    }
    //Data class is a class used only to hold data
    data class EASY(val id: String, val name: String): EntityTwo()
    data class MEDIUM(val id: String, val name: String): EntityTwo()
    data class HARD(val id: String, val name: String, val muli: Float): EntityTwo()
}



fun main(){
    val entity = EntityFactory.create(entityType.EASY)
    println(entity)
    val entityTwo = EntityFactory.create(entityType.MEDIUM)
    println(entityTwo)

    val doubleEntity = EntityFactoryTwo.create(entityType.HARD)
    val quadEntity = EntityFactoryTwo.create(entityType.HARD)
    println(doubleEntity)

    //Data Classes allow us to deal with diffrent object as equals if they contain similair informtion
    if(doubleEntity == quadEntity){
        println("Yes")
    }
    else{
        println("No")
    }
}

