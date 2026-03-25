package herenca

//toda classe é fechada(final por padrao), logo precisa usar o open
open class Animal(val idade: Int){

    fun sayHello() =
        println("Eu sou um animal de $idade anos")

    open fun eat() =
        println("Animal comendo")
}

//pra fazer a heranca, precisa chamar o construtor
//precisa deixar a classe e o metodo open para utilizar(Animal)
class Cavalo : Animal(17){
    override fun eat() =
        println("Cavalo pastando")
}

fun main(){
    val cavalo = Cavalo()
    cavalo.eat()
}