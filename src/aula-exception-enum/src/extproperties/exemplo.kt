package extproperties

val Int.pol: Double
    get() =
        2.54 * this

fun main(){
    val medida = 2.pol
    println("Medida: $medida")
}