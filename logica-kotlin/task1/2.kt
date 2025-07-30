/*
Usa un bucle while para recorrer todos los números del 1 al 10 y mostrar únicamente los pares

Incluye tu código en la respuesta
 */
fun main(){
    var con : Int = 1
    while( con <= 10){
        if(con % 2 == 0){
            println(con)
        }
        con++
    }
}