fun transformar1(s: String, op: (String) -> String): String{
    return op(s)
}

/*Exercício 1. Declare uma função `transformar()` que receba dois parâmetros:
- Uma string s; e
- Uma expressão lambda, op.
A função deve retornar uma versão da string s alterada pelo lambda op.
Experimente chamar a função passando um lambda que retorne a string convertida para letras
maiúsculas -- `str.uppercase()`.
Repita o procedimento passando um lambda que retorne o primeiro caracter da string. Para retornar
o primeiro caracter de uma string s, use a expressão s[0].*/

fun main(){
    val nome: String
    val maiusculo = transformar1("Tufy") {nome -> nome.uppercase()}
    println(maiusculo)



    val primeiraLetra = transformar1("Tufy") {nome -> nome.first().toString()}
    println(primeiraLetra)

}