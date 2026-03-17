package exceptions

fun validarPorcentagem(p: Int) =
    if(p in 1..100)
        p
    else
        throw IllegalArgumentException()

fun main(){
    val porcentagem = validarPorcentagem(10)
    println("$porcentagem %")
}