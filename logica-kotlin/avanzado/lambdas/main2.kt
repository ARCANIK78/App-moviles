private fun String.noSpaces(): String{
        return this.replace(" ", "")
    }

private fun IntArray.show(){
    print("[ ")
    for(i in this) print("$i ")
    println("]");
}
private fun recorrerArray(array: IntArray, fn: (Int)-> Unit){
    for(i in array)
        fn(i)
}
fun main(){
    
    var array =  IntArray(10){5}
    println("array: "); array.show();
    var array4 = IntArray(10){it}
    println("array4: "); array4.show();
    var array5 = IntArray(10){it*2}
    println("array5: "); array5.show();

    var array6 = IntArray(10){it % 2}
    println("arra6: "); array6.show();
    var arra7 = IntArray(10){i-> i*3}
    println("array7:"); arra7.show();


    var suma = 0
    recorrerArray(arra7){
        suma += it
    }
    println("la suma es = ${suma}")
}