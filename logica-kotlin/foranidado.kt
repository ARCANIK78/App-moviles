fun main(){
    var matriz = arrayOf(
        intArrayOf(1,2,3),
        intArrayOf(4,5,6,7,8,9,10),
        intArrayOf(11,12,13)
    )
    for(i in (0 until matriz.size)){
        println()
        for(x in (0 until matriz[i].size)){
            println("Posicion[$i][$x] : ${matriz[i][x]}")
        }
    }
}