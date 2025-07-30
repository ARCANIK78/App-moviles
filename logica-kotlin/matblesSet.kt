fun main(){
    var setMezclado = setOf(2, 4.44, "casa", 'c')
    
    var clientes : MutableSet<Int> = mutableSetOf(1234,1235,543,3454,9657)
    println(clientes)
    clientes.add(45054)
    println(clientes)
    clientes.remove(543)
    clientes.remove(9657)
    println(clientes)

    println("El numero de los clientes ${clientes.size}")
}