

fun mostrar_saldo(saldo: Float,moneda:String){
    println("Tienes $saldo $moneda")
}
fun ingresar_sueldo(saldo: Float, sueldo: Float, moneda:String): Float{
    val nuevosaldo = saldo + sueldo
    println("Se ha ingresaod tu sueldo de $sueldo $moneda")
    mostrar_saldo(nuevosaldo, moneda)
    return nuevosaldo
}
fun main(){
    var saldo : Float = 300.56f
    var sueldo : Float = 766.02f
    var moneda : String = "USD"
    saldo = ingresar_sueldo(saldo,sueldo,moneda)
}