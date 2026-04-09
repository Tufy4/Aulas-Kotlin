package exercicios-treino.semana5

/*Exercício 1. Você está desenvolvendo um sistema para a usina termo-nuclear de Springfield.
Sua tarefa é definir uma função em Kotlin que receba um enum e retorne a descrição
correspondente para cada um dos três níveis de perigo a seguir.
• BAIXO: "Tudo funcionando perfeitamente".
• MEDIO: "Cuidado! Monitore os níveis de radiação".
• ALTO: "Fuja para as colinas!"
 */

 enum class Descricao{
    BAIXO, MEDIO, ALTO
 }

fun niveis(val tipo: Descricao): String{
    when(tipo){
        Descricao.BAIXO -> "Tudo funcionando perfeitamente"
        Descricao.MEDIO -> "Cuidado! Monitore os níveis de radiação"
        Descricao.ALTO -> "Fuja para as colinas!"
    }
}
 fun main(){
    println(niveis(Descricao.BAIXO))
 }