fun main(){
    var hoy : dias = dias.LUNES
    println(hoy)
    var semana = dias.values()
    for(i in semana) println(i)

    println(dias.valueOf("MIERCOLES"))
    println(hoy.name)
    println(hoy.ordinal)
    println(hoy.saludo())

    println(hoy.laboral)
    println(hoy.jornada)
    
    hoy = dias.DOMINGO
    println(hoy.laboral)
    println(hoy.jornada)

}

