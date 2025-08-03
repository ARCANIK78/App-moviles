
fun main(){
    var sc = SubClase()
    println(sc.presentar())

    var ani = SubClase.Anidad()
    println(ani.presentar())

    var inn = SubClase().Interna()
    println(inn.presentar())


    //objetos anonimos
    println(fernanda.saludo())
    fernanda.apodo = "SuperFer"
    println(fernanda.saludo())

    //data class
    var sol : Star = Star("Sol",69546f,"via Lactea")
    println(sol)
    var betelquese : Star = Star("Betelquese",667777767f,"orion")
    println(betelquese)
    betelquese.alive = false
    println(betelquese.alive)

    var nueva: Star = Star()
    println(nueva)
}
