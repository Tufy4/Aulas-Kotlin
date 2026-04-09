package exercicios-treino.semana5

/*Exercício 2. Use try/catch para implementar uma função `divisao(a: Int, b: Int): Int?` que retorne o
resultado da divisão de a por b ou null quando `b == 0`.
Desenvolva duas versões da função:
a) Usando `try/catch` tradiconal.
b) Usando `try` como uma expressão. */

fun divisao(a: Int, b: Int): Int?{
    try{
        return a / b
    }catch(e ArithmeticException){
        e.printStackTracee
        return null
    }
}

fun divisao2(a: Int, b: Int): Int? =
    try{
        a / b
    }catch(e ArithmeticException){
        e.printStackTracee
        null
    }



fun main(){
    val res = divisao(7, 0)
    println(res)
}


/*/*
Exercício 3. Defina uma função de extensão para a classe `Int` chamada `isEven()`, que deverá
retornar true se o número representado pelo objeto da classe Int for par ou false em caso contrário
 */ */


fun Int.isEven: Boolean{
     return this % 2 == 0
}

fun main(){
    val res = 1.isEven
    println("É par: $res")
}

/*
Exercício 4. Defina uma propriedade de extensão para a classe `Double` chamada `milesToKm`.
Essa propridade deve retornar a quantidade de quilômetros correspondente a uma distância em
milhas (km = milhas * 1.6)
 */

 val Double.milesToKm: Double
    get() = 
        this * 1.6


fun main(){
    val res = 32.3.milesToKm
    println("O valor em km é: $res")
}


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

 val Date.weekday{
    get() {
        val format = SimpleDateFormat("EEEE", Locale("pt", "BR"))
        return format.format(this).replaceFirstChar { it.uppercase() }
    }
 }

fun main() {
    val today = Date()
    println(today.weekday)