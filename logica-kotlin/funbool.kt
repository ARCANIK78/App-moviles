
fun esUsuarioValido(usuario: String, contraseña: String): Boolean{
    val usuarioRegistrado = mapOf(
        "juan" to "1234",
        "ana" to "abcd",
        "luis" to "qwerty"
    )
    if(usuarioRegistrado[usuario] == contraseña) return true
    else return false 
}
fun mostrarMensajeDeAcceso(usuario: String, contraseña: String){
    if(esUsuarioValido(usuario, contraseña) == true){
        println("Bienvenido "+ usuario)
    }else{
        println("acceso denegado")
    }
}

fun main(){
    mostrarMensajeDeAcceso("juan", "1234")   // Bienvenido, juan!
    mostrarMensajeDeAcceso("maria", "0000") // acceso denegado
    mostrarMensajeDeAcceso("Duran","12333")
    mostrarMensajeDeAcceso("luis","qwerty")
}