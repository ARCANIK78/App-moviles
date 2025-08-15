import java.io.File

fun leerUsuarios(archivo: String): List<Usuario>{
    val lista = mutableListOf<Usuario>()
    try{
        File(archivo).forEachLine{ line ->
            val partes = line.split(",")
            val nombre = partes[0]
            val edad = partes[1].toInt()
            if( edad < 0) throw IllegalArgumentException("Edad negativa para $nombre")
            lista.add(Usuario(nombre, edad))
        }
    }catch (e: Exception){
        println("Error leyendo archivo: ${e.message}")
    }
    return lista

}
fun main(){
    val usuarios = leerUsuarios("people.txt")
    println("Usuarios validos: ")
    usuarios.forEach {println(it)}
}
