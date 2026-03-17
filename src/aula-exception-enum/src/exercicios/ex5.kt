package exercicios

import java.util.Date
import java.text.SimpleDateFormat
import java.util.Locale
/*
Exercício 5. Defina uma propriedade de extensão chamada `weekday` para a classe `java.util.Date`.
Essa propriedade deve retornar o nome do dia da semana correspondente a um objeto `Date`.
Veja um exemplo de como a propriedade será usada.
fun main() {
val today = Date()
println(today.weekday)
// exibe na tela: Segunda-feira
}
 */

val Date.weekday: String
    get() {
        val format = SimpleDateFormat("EEEE", Locale("pt", "BR"))
        return format.format(this).replaceFirstChar { it.uppercase() }
    }

fun main() {
    val today = Date()
    println(today.weekday)
}