
fun main(){
    val num: Int = 1
    val jota: Persona = Persona("jota", "ab323cds43")
    var anonimo : Persona = Persona()
    println(jota.alive)
    println(jota.name)
    println(jota.passaport)
    jota.die()
    println(jota.alive)
    
    println("\n${anonimo.name}")
    var pele : Atleta = Atleta("Pepe","c443c23d2","Basquebolt")
    println(pele.name)
    println(pele.passaport)
    println(pele.sport)
    println(pele.alive)
}
