fun main(){

    val fecha = "05/11/2025"
    var mes = fecha.subSequence(3,5).toString().toInt()

    when(mes){
        1,2,3 -> print("\n En Invierno no hay ofertas de inviersiones")
        4,5,6 -> print("\n En primavera hay ofertas de inversiones con el 1.5%")
        7,8,9 -> print("\n En verano hay ofertas de inversiones con el 2.5%")
        11-> print("\n En Novimbre Hay una Super Oferta del 99% sin intereses")
        10,12 -> print("\n en otoño hay ofertas de inversiones con 3.5%")
        else -> print("\n La fecha es erronea")
    }

}