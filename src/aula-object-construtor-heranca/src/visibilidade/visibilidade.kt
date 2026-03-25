package visibilidade

class Robot{
    private val _model = "T800"

    /*fun getModel(): String{
        return model
    }*/

    val model
        get() = _model

    private fun act(){
        println("I'll be back")
    }


}

fun main(){
    val terminator = Robot()
    //terminator.act()
    println(terminator.model)
}