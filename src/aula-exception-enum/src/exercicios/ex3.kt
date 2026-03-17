package exercicios

import extproperties.pol

/*
Exercício 3. Defina uma função de extensão para a classe `Int` chamada `isEven()`, que deverá
retornar true se o número representado pelo objeto da classe Int for par ou false em caso contrário
 */

val Int.isEven: Boolean
    get() =
        if(this % 2 == 0) true else false


fun main(){
    val ehPar = 1.isEven
    println("É par: $ehPar")
}