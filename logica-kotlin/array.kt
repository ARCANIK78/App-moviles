
fun main(){
    var recibos: Array<String> = arrayOf("Agua","Luz","Gas","Internet","Gasolina")
    for(i in recibos.indices){
        println("$i.-${recibos[i]}")
    }
    var matriz = arrayOf(
        intArrayOf(1,2,3),
        intArrayOf(4,5,6),
        intArrayOf(7,8,9)
    )
    
    for(i in recibos.indices) println(recibos.get(i))


    for(i in 0 .. recibos.size -1){
        println("${i+1}: ${recibos.get(i)}" )
    }
}