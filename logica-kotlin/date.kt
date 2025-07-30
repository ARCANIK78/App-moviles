import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(){
    val fechaHoraActual = LocalDateTime.now()
    println(fechaHoraActual)
    val formatoCompleto = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy")

    val fechaFormateada = fechaHoraActual.format(formatoCompleto)
    println("Fecha y Hora actual (formato completo ${fechaFormateada})")
}