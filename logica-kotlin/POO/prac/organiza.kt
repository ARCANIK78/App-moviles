open class Persona(var nombre : String, var edad: Int){
    open fun saludar(): String{
        return "Hola soy ${nombre}, y tengo ${edad}"
    }
}
class Programador(nombre: String, edad: Int , var lenguajeProgamacion : String): Persona(nombre, edad){
    override fun saludar(): String{
        return "Hola soy ${nombre}, y tengo ${edad} y programo en ${lenguajeProgamacion}"
    }
}