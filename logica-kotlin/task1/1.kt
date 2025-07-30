/*
Usa un bucle do-while para mostrar por pantalla una cuenta regresiva del 9 al 0 igual que cuando hay un lanzamiento de un cohete por parte de la NASA.

Incluye tu código en la respuesta
 */
fun main(){
    var inicio : Int = 9
    println("Lanzamiento del cohete activo")
    println("Empieza en:")
    while(inicio >= 0){
        println(inicio)
        inicio--
    }
    println("Mision Terminada")
}
