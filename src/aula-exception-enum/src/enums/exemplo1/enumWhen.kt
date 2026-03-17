package enums.exemplo1

fun mapToName(color: Color) =
    when(color){
        Color.RED -> "Vermelho"
        Color.GREEN -> "Verde"
        Color.BLUE -> "Azul"
    }
fun main(){
    println(mapToName(Color.GREEN))
}