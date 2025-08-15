fun dividir(a: Int, b:Int): Int{
    return try{
        a / b
    }catch (e: ArithmeticException){
        println("Error: No se puede dividir entre 0.")
        0
    }
}

fun main(){
    println(dividir(10,2))
    println(dividir(5,0))


    try{
        println("division 5/0 ${5/3}")
    }catch(e:Exception){
        println("Vamos a manejar este error")
    }finally{
        println("Pase lo que pase vamos hacer costias")
    }
}