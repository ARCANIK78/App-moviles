
data class Star(var name: String = "", val radios: Float = 0f, var galaxy: String = ""){
    var alive = true
    fun die(){ alive = false}
}
