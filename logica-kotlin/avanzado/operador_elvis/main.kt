fun main(){
    var pais : String = "rusia"
    pais = pais?.uppercase() ?: "DESCONOCIDO"
    println(pais)

    var ciudad : String? = null
    ciudad = ciudad?.uppercase() ?: "DESCONOCIDO"
    println(ciudad)
}