private fun valet_try(a: Int, b: Int): Any{
    var res = 
        try{
            println("Division $a, $b")
            a/b 
        }catch(e : Exception){
            println("Vamos a manejar este error ")
            "Division no permitida"
        }
        return res
}
fun main(){

    var p1 = valet_try(10,2)
    println(p1)
    var p2 = valet_try(10,0)
    println(p2)
}