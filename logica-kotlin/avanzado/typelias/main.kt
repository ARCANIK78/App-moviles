typealias usuarioID = String

fun obtenerUsuario(id: usuarioID){
    println("Buscar Usuario con ID $id")
}

fun main(){
    val id: usuarioID = "ab12"
    obtenerUsuario(id)
}