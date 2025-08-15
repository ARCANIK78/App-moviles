
class IllegalPasswordException(message: String): Exception(message)

fun main(){
    var  password : String = "qwer"
    if (password.length < 6){
            throw IllegalPasswordException("Password muy corta")
        }else println("Password confirmada")
    
}
