fun transformar3(s: String, op: (String) -> String): String{
    return op(s)
}

/*Exercício 3. Experimente chamar a função `transformar()`, do Exercício 1, de duas maneiras:
- Passando a expressão lambda entre parênteses;
- Passando a expressão lambda fora dos parênteses*/

fun main(){
    val nome: String
    val maiusculo = transformar3("Tufy") {nome -> nome.uppercase()}
    println(maiusculo)



    val primeiraLetra = transformar3("Tufy") {nome -> nome.first().toString()}
    println(primeiraLetra)

}