package classes
class Pessoa(val nome: String, var estudante: Boolean){
    fun dizerOi(){
        println("Meu nome é $nome")
        val papel = if (estudante) "sou" else "não sou"
        println("Eu $papel estudante")
    }
}

fun main(){
    val p = Pessoa("Mário", true)
    println("Nome: " + p.nome)
    println("Estudante: " + p.estudante)
    p.estudante = false
    println("Estudante: " + p.estudante)
    p.dizerOi()
}