fun policia(edad: Int){
    try{
        if(edad > 18){
            println("bienvenido recluta")
        }else{
            println("No es tu momento ")
        }
    }catch(e: Exception){
        println("Hubo un problema con el uso del sistemas")
    }finally{
        println("Gracias Por usar el Sistema XILIOS")
    }
}
fun main(){
    var recluta : Int = 21
    var recluta2 : Int = 12
    var recluta3 : Int = 44
    policia(recluta)
    policia(recluta2)
    policia(recluta3)
}