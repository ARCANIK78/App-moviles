private fun calculadora(n1: Int, n2: Int, funcion:(Int, Int) -> Int): Int{
    return funcion(n1, n2)
}

fun main(){
    var funcion = { x: Int, y: Int -> x+y}
    println("la suma ${funcion(30,30)}")
    println("La suma es ${calculadora(30,35, funcion)}")
    println("Con lambdas ")
    println("La resta es ${funcion(50,10)}")
    println("La resta es ${calculadora(70,20, { x: Int, y: Int -> x-y})}")
    println("big more")
    println("La potencia es ${calculadora(2,6,
        {x,y -> 
            var valor = 1 
            for(i in 1..y) valor *= x 
            valor }
            )}")
}