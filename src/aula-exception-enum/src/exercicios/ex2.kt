package exercicios
/*
Exercício 2. Use try/catch para implementar uma função `divisao(a: Int, b: Int): Int?` que retorne o
resultado da divisão de a por b ou null quando `b == 0`.
Desenvolva duas versões da função:
a) Usando `try/catch` tradiconal.
b) Usando `try` como uma expressão.
 */

fun divisao(a: Int, b: Int): Int?{
    try{
        return a / b
    }catch(e: ArithmeticException){
        return null
    }
}

fun divisao2(a: Int, b: Int): Int? =
    try{
         a / b
    }catch(e: ArithmeticException){
         null
    }


fun main(){
    val res = divisao(7, 0)
    println(res)
}