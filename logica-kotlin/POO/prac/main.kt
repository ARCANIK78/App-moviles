fun main(){
    var est1 : Estudiante = Estudiante("Juancito",43.4f)
    var EstudianteString : String = "El estudiante ${est1.nombre} "
    var resul : String = ""
    if(est1.aprobo() == true) resul = ("Aprobo con ${est1.notaFinal}") 
    else resul = "No Aprobo con ${est1.notaFinal}"
    println(EstudianteString + resul)
}

