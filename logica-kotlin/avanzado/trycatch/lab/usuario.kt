data class Usuario(
    val nombre : String,
    val edad: Int
)

/*
kotlinc usuario.kt main.kt -include-runtime -d programa.jar
java -jar programa.jar
 */