    fun transformar2(s: String?, op: (String) -> String): String?{
        return s?.let(op)
    }

    /*Exercício 2. Modifique a função `transformar()` para que o parâmetro s possa assumir o valor null.
    Use esta nova versão da função para executar um lambda que retorne o primeiro caracter da string s.
    Caso o valor de s seja null, retorne “x” no lugar do primeiro caracter*/

    fun main(){
        val nome: String

        val primeiraLetra = transformar2("Tufy") {nome -> nome.first().toString()} ?: "x"
        println(primeiraLetra)

    }