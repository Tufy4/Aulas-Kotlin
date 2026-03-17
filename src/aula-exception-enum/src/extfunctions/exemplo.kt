package extfunctions

fun String.lastChar() = this.get(this.length-1)
fun String.lastWord() = this.split("").last()

fun main(){
    val msg = "batatinha quando nasce"
    println(msg.lastChar())
    println(msg.lastWord())
}