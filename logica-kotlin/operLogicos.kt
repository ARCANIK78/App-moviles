fun main(){
    var a: Int =5
    var b: Int = 10
    println(a == b)
    println(a != b)
    println(a > b)
    println(a < b)
    println(a >= b)
    println(a <= b)

    println("----------------")
    var verdadero1: Boolean = true
    var verdadero2: Boolean = true
    var falso: Boolean = false
    println("true y true")
    println(verdadero1 && verdadero2)
    println(verdadero1 || verdadero2)
    println("true y false")
    println(verdadero1 && falso)
    println(verdadero1 || falso)

}