interface  InterfaceProvider{
    fun getId():String
}

class Entity private constructor(val id: String)
{
    //Onlly one per class and can be named
    //It can also be hooked up to intergaces
    companion object Helper : InterfaceProvider {
        //Variables can be assigned in the companion objec t
        const val id = "id"
        //So can functions
        fun create() = Entity(id = "Id")
        
        override fun getId(): String {
            return id
        }
    }
}

//When you're in a situation where you have a
//private class a companion object can act as a in between

fun main(){
    //Cant do this val entity = Entity(id = "aa")
    //We use the companion object
    val entity = Entity.Helper.create()
    //You don't have to use the Companion
    val entity2 = Entity.create()
    println(entity.id)

}

