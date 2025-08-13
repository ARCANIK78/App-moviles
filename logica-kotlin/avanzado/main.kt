private fun String.noSpaces(): String{
        return this.replace(" ", "")
    }

private fun IntArray.show(){
    println("[")
    for(i in this) println("$i ")
    println("]");
}
fun main(){

    var usuario = "  soy yo  "
    println(" ${usuario} (${usuario.length}) - ${usuario.noSpaces()} (${usuario.noSpaces().length})")
    var array1 : Array<Int> = arrayOf(5,3,2,2,1)
    var array2 = IntArray(3)
    array2[0] = 10
    array2[1] = 20
    array2[2] = 30
    print("array2: "); array2.show();
    var array3 : IntArray = intArrayOf(1,2,3,4,5)
    print("array3: "); array3.show();
    
}