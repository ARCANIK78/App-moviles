private fun calculadora(n1: Int, n2: Int, funcion:(Int, Int) -> Int): Int{
    return funcion(n1, n2)
}

private fun suma(x : Int, y : Int): Int {return x+y}
private fun resta(x : Int, y : Int): Int {return x+y}
private fun multiplica(x : Int, y : Int) = x*y
private fun division(x: Int, y: Int) = x/y

fun main(){
    println("La suma = ${calculadora(80,20,::suma)} ")
    println("La suma = ${calculadora(80,20,::resta)} ")
    println("La suma = ${calculadora(80,20,::multiplica)} ")
    println("La suma = ${calculadora(80,20,::division)} ")
}
