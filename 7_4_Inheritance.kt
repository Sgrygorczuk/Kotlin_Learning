//When inheriting you intilize it like a intefacae with the :
class FancyInfoProvider : FourthInfoProivder() {

    //We can change this value beauce it's open but we cannot change the other one
    override val sessionPrefix: String
        get() = "Snooze"

    //We can overwrite the parent functions
    override val proivderInfo: String
        //Get custom getter where it uses the orignal implemination
        //get() = super.proivderInfo
        //But we can overwrite it to anything
        get() = "OVER MY DEAD BODY"

    override fun printInfo(person: Person) {
        println("Fancy Info")
        super.printInfo(person)
    }
}
