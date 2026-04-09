package exercicio-treino.semana6

/*Exercício 1. Crie uma interface chamada Drivable com os seguintes métodos:
• fun drive(): abstrato
• fun stop(): com implementação padrão que imprime "Parando o veículo."
Crie uma classe Carro que implemente a interface Drivable.
Implemente o método drive() para imprimir "Dirigindo o carro."
No main, crie uma instância de Carro e chame os dois métodos. */

interface Drivable{
    fun drive()
    fun stop(){
        println("Parando o veiculo")
    }
}

class Carro : Drivable{
    override fun drive(){
        println("Dirigindo o carro")
    }
}

fun main(){
    val carro = Carro()
    carro.drive()
    carro.stop()
}

/*Exercício 2. Crie uma classe Veiculo contendo um atributo privado placa.
A classe Veiculo deve ter dois métodos:
• mover(), que deve exibir a mensagem "O veículo $placa está se movendo.";
• parar(), que deve exibir "$placa parou.".
Crie duas subclasses de veículo: Onibus e Carro. Em cada subclasse, o método mover() deve exibir
a mensagem adequada ao tipo da classe:
• "O ônibus $placa está se movendo."; ou
• "O carro $placa está se movendo.".
O atributo placa deve permanecer privado na classe Veiculo.
No método main(), crie instâncias de Onibus e Carro, atribuindo placas diferentes a cada um. Use
essas instâncias para demonstrar o funcionamento dos métodos mover() e parar(). */

open class Veiculo(private val placa: String){
    
    
    open fun mover(){
        println("O veículo $placa está se movendo.")
    }

    fun parar(){
        println("$placa parou.")
    }

}

class Onibus(placa: String) : Veiculo(placa){
    override fun mover(){
        println("O ônibus $placa está se movendo.")
    }
}

fun main(){
    val onibus = Onibus("123")
    onibus.mover()
}