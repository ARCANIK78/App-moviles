data class start(
    val name: String,
    val radius: Float,
    val galaxy: String
)
fun main(){
    val sol = start("sol",6546f,"via_lactea")
    println(sol)
    //Desestructurada
    val (name_start2, radius_start2,galaxy2) = start("sol2",65456f, "andromea")
    println(name_start2)
    println(radius_start2)
    println(galaxy2)

    val (name_start3, _, galaxy3) = start("marte", 6764f,"via_lactea")
    println("Datos desructurado ${name_start3} - ${galaxy3}")

    var componente = start("Luna", 546f,"via_lactea")
    println("Datos start con componen ${componente.component1()},${componente.component2()},${componente.component3()}")
}