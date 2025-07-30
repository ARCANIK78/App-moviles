
fun main(){
    var pin:Int = 1234
    var intentos:Int = 0
    var clave_ingresada:Int = 1232
    do{
        println("Ingrese el PIN: ")
        println("Clave ingresada: ${++clave_ingresada}")
        if(clave_ingresada == pin) break
        intentos++

    }while(intentos < 3 && clave_ingresada != pin)
    if(intentos < 3){
        println("Tarjeta Bloqueada")
    }
}
