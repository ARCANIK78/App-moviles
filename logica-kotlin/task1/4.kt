/*
Crea el mismo ejercicio de antes pero ahora con un array de conjuntos de datos
Cada elemento del array debe contener el nombre del plato y su precio    */

fun main(){
    var platos = arrayOf(
        arrayOf("Majadito","Lomo","Picante","Charque"),
        arrayOf(12.4f, 43.2f, 10.4f, 22.54f)
    )
    println("Menu de hoy")
    for(i in (0 until platos.size -1)){
        println()
        for(x in (0 until platos[i].size)){
            println("${platos[i][x]} = ${platos[i+1][x]}")
        }
    }
}
