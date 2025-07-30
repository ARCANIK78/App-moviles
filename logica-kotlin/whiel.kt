fun main(){
    var moneada : String = "USD"
    var inversiones = mutableMapOf<String, Float>(
        "Coca-Cola" to 143f,
        "Adidas" to 123f,
        "Amazon" to 666f,
    )
    var bolsa : MutableList<String> = mutableListOf("Coca-Cola","Adidas","Pfizer","Amazon")
    bolsa.add("Nvidia")

    var empresa : String? = null
    var saldo : Float = 1000f
    var saldo_a_invertir = 90f
    var index = 0
    while(saldo >= saldo_a_invertir){
        empresa = bolsa.elementAtOrNull(index)
        if(empresa != null){
            saldo -= saldo_a_invertir
            println("Se a invertido ${saldo_a_invertir} ${moneada} en empresa ${empresa}")
        }else break
        index++
    }
}