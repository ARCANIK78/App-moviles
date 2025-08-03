fun main(){
    var empleado1 : Empleado = Empleado("PedroGomez",500.54f)
    var gerente1 : Gerente = Gerente("LucasSSS",600.44f,50.54f)
    println(empleado1.salario)
    println(gerente1.calcularPago())
}
/*
kotlinc mainEm.kt clasesEmpleado.kt -include-runtime -d prograEm.jar
java -jar prograEm.jar
 */
