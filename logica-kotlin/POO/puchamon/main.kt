fun main(){
    var mounstro : Puchamon = Puchamon()
    println(mounstro.getName())
    println(mounstro.getAttackPower())
    println(mounstro.getLife())
    mounstro.setLife(30f)
    println(mounstro.getLife())
}
/*

kotlinc Puchamon.kt main.kt -include-runtime -d programa.jar
java -jar programa.jar

*/