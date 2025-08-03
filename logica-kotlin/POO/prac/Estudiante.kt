class Estudiante(var nombre : String, var notaFinal : Float){

    fun aprobo(): Boolean{
        return if(notaFinal >= 51) true
        else false
    }
}