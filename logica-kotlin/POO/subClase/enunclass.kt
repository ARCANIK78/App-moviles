
enum class dias(val laboral: Boolean, val jornada: Int){
    LUNES(true, 3), MARTES(true, 8), MIERCOLES(true, 5), JUEVES(true, 9), VIERNES(true, 6), SABADO(false, 4), DOMINGO(false, 0);
    fun saludo(): String{
        when (this){
            LUNES -> return "Empezamos con alegria!!"
            MARTES -> return "ya queda menos!!"
            MIERCOLES -> return "sabias que los miercoles son los dias mas productivos?"
            JUEVES -> return "esta noches es jueves"
            VIERNES -> return "Hoy es viernes y tu cuerpo lo sabe"
            SABADO, DOMINGO -> return "hoy es un gran dia para descansar"
            else -> return "a quemar el findeeee!"
        }
    }
}
