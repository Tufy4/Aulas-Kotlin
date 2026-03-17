package enums.exemplo1

enum class Color{
    RED, GREEN, BLUE
}

fun funcao(color: Color){
    println(color)
}


fun main(){
    var color: Color = Color.GREEN
    funcao(color)
}