open class Empleado(var nombre : String, var salario : Float)
    class Gerente(nombre: String, salario: Float, val bono: Float): Empleado(nombre, salario){
        fun calcularPago(): Float {
            return salario + bono
        }  
    
}