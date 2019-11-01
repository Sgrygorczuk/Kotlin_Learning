/*
Tutorial from  freeCodeCamp.org
Kotlin Course - Tutorial for Beginners
https://www.youtube.com/watch?v=F9UC9DY-vIU
 */
//So the way you initlize that a parameter is a list is you write List<datatype>
fun passingLists(items:List<Double>)
{
    items.forEach{item->
        println(item)
    }
}

fun main() {
    //By placing something in the array it figures out
    //What data type it is.
    val interestingThings = arrayOf("Kotlin Hello", "Never agian","Cut my life into pieces")
    //Arrays are treated like a class with several functions associated with them
    //using the '.' operator
    println("interestingThings size " + interestingThings.size)
    //You can use normal [] indexing
    println("interestingThings at 0 " + interestingThings[0])
    //Or you can use a get function
    println("interestingThings at 0 " + interestingThings.get(0))

    //The for loop is structured like that in python
    for (thing in interestingThings)
    {
        println("interestingThings $thing")
    }

    //Array has a for loop function in it where it lets you got by each element in the array
    //It defaults to it as the element name but you can change it using the ->
    interestingThings.forEach{ newName ->
        println("interestingThings $newName")
    }

    //There is a second built-in for loop that keeps track of your index position in the array
    interestingThings.forEachIndexed {index, thing ->
        println("interestingThings: $thing is at index $index")
    }

    //Few differences between arrays and lists are, arrays are fixed size while list can grow and shrink
    //Lists are initialized and have the same class as functionality like arrays
    val boringThings = listOf(1,2,3,4) //This list however cannot have stuff added to it, it has to be specified
    println("boringThings: $boringThings[3]")

    //With this list we can add and subtract things and make the list grow
    val notSoBoringThings = mutableListOf(2.32, 332.2, 11.2, 553.2)
    println("notSoBoringThings: $notSoBoringThings")
    notSoBoringThings.add(211.22)
    println("notSoBoringThings: $notSoBoringThings")

    //Takes in pairs kind of works like a dictonary in Python
    //maps work like list and need to specify that you can increse them
    val mapy = mapOf(1 to 'a', 2 to 'b', 3 to 'c', 4 to 'd')
    mapy.forEach{key, value ->
        println("mapy: $key has value $value")
    }

    //We can add stuff to this one
    val mapysBrother = mutableMapOf("a" to 1, "b" to 2, "c" to 3, "d" to 4)
    println("mapysBrother: $mapysBrother")
    mapysBrother.put("e",5)
    println("mapysBrother: $mapysBrother")

    passingLists(notSoBoringThings)
}

