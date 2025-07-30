
fun clasificarEdad(edades: Int):String{
    return when {
        edades < 0 -> "Edad Invalida"
        edades in 0..12 -> "Niño"
        edades in 12..17 -> "Adolecente"
        edades in 18..18 -> "Adulto"
        else -> "Adulto mayor"
    }
}
 
fun main(){
    var edad1: Int = 5
    var edad2: Int = 16
    var edad3: Int = 30
    var edad4: Int = 70
    var edad5: Int = -1
    println(clasificarEdad(edad1))
    println(clasificarEdad(edad2))
    println(clasificarEdad(edad3))
    println(clasificarEdad(edad4))
    println(clasificarEdad(edad5))
}