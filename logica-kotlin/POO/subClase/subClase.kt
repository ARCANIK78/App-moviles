class SubClase {
    private var name = "padre"
    fun presentar() : String { return name}
    
    class Anidad{
        private val nameAnidad = "Anidada"
        fun presentar(): String { return nameAnidad}
    }
    inner class Interna{
        private val nameInterna = "Interna"
        fun presentar(): String {return "Hola hoy ${this.nameInterna}, hija de ${name}"}
    }
}
//objetos anonimos
object fernanda{
        var apodo = "fer"
        fun saludo() { println("Hola, me llaman ${apodo}")}
}

