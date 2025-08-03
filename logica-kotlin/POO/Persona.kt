
open class Persona(var name: String = "Anonimo", var passaport: String? = null){

    var alive : Boolean = true

    fun die(){
        alive = false
    }
    fun live(){
        alive = true
    }
}

class Atleta(name: String, passaport: String?, var sport: String): Persona(name, passaport){

}
