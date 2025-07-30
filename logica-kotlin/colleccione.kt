
fun main(){
    var clienteVIP : Set<Int> = setOf(1234,5678,4040)
    var setMezclado = setOf( 2, 4.435, "Casa", 'c')

    println("Clientes VIP: \n")
    println(clienteVIP)
    println("Cantidad de CLientes VIP: ${clienteVIP.size}")

    var existe : Int = 1234
    if(clienteVIP.contains(existe)) println("El $existe si es VIP")
    else println("El $existe no es VIP")
}