fun main(){
    var persona1 : Persona = Persona("Jose",34)
    var persona2 : Programador = Programador("Miriam",21,"JavaScript")
    println(persona1.saludar())
    println(persona2.saludar())
}
/*
kotlinc organiza.kt mainPerson.kt -include-runtime -d prograOrganiza.jar
java -jar prograOrganiza.jar
 */
