open class Person(var name: String ="Anonimo", var passaport: String? = null, var altura: Float = 17.50f){
    var alive: Boolean = true

    fun die(){ alive = false}

    fun checkPolicia(fn:(Float) -> Boolean): Boolean{
        return fn(altura)
    }
}

private fun inColombia(h: Float): Boolean{
    return h>1.60f
}

private fun inSpain(h: Float): Boolean{   
    return h> 1.50f 
}
private fun Person.checkPolicia(fn: (Float)->Boolean): Boolean{
    return fn(altura)
}
fun main(){
    var jota = Person("Jota","7765765",1.90f)
    if (jota.checkPolicia(::inColombia)) println("${jota.name} puede ser policia en Colombia")
    else println("No puede ser policia en colombia")
    if (jota.checkPolicia(::inSpain)) println("${jota.name} puede ser policia en España")
    else println("No puede ser policia en España")
}