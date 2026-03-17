package exercicios
/*
Exercício 1. Você está desenvolvendo um sistema para a usina termo-nuclear de Springfield.
Sua tarefa é definir uma função em Kotlin que receba um enum e retorne a descrição
correspondente para cada um dos três níveis de perigo a seguir.
• BAIXO: "Tudo funcionando perfeitamente".
• MEDIO: "Cuidado! Monitore os níveis de radiação".
• ALTO: "Fuja para as colina
 */

enum class Perigo{
    BAIXO, MEDIO, ALTO
}

fun Springfield(perigo: Perigo) =
    when(perigo){
        Perigo.BAIXO -> "Tudo funcionando perfeitamente"
        Perigo.MEDIO -> "Cuidado! Monitore os níveis de radiação"
        Perigo.ALTO -> "Fuja para as colina"
    }
fun main(){
    println(Springfield(Perigo.BAIXO))
}