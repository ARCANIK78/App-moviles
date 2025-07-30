/*Usa un bucle for para recorrer un array en el que estén almacenados los diferentes platos que ofrece un restaurante y mostrarlos por pantalla

Incluye tu código en la respuesta
 */

 fun main(){
    var platos : Array<String> = arrayOf("Majadito","Lomo","Picante","Charque")
    for(i in platos.indices){
        println("${i}.- ${platos[i]}")
    }
 }