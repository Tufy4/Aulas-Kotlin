package enums.exemplo2

enum class Color(val r: Int,val g: Int, val b: Int){
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255);

    fun printRGB() = println("($r, $g, $b)")
}

fun funcao(color: Color){
    println(color)
}


fun main(){
    var color: Color = Color.GREEN
    funcao(color)
    color.printRGB()
}