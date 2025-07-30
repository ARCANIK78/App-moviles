fun main(){
    var divisas : List<String> = listOf("USD","EUR","YEN")
    println(divisas)

    for(i in divisas.indices){
        println("$i .- 100 ${divisas[i]}")
    }

    var bolsa : MutableList<String> = mutableListOf("Coca-Cola","Adidas","Pfizer","Amazon")
    bolsa.add("Nvidia")
    bolsa.removeAt(2)
    println(bolsa)
    println(bolsa.first())
    println(bolsa.last())
    println(bolsa.elementAt(2))
    println(bolsa.none())
    println(bolsa.clear())
    println(bolsa)
    println(bolsa.none()) 
}