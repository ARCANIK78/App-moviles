fun main(){
    var pais : String = "Bolivia"
    var ciudad : String? = null
    ciudad = ciudad?.uppercase() ?: "DESCONOCIDA"
    println(ciudad)

    val calle: String by lazy {"Nueva"}

    var direccion = "$pais - $ciudad - $calle"
    println(direccion)
}