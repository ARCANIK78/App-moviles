fun operacionesAritmeticas(num1: Int, num2: Int, funcion: ((Int, Int) -> Int)): Int{
    return funcion(num1, num2)
}
fun suma(num1: Int, num2: Int): Int{
    return num1 + num2
}
fun main(){
    print("Suma: ${operacionesAritmeticas(10,5,::suma)}")
}