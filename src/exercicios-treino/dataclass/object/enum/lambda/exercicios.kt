package exercicios-treino.dataclass/object/enum/lambda


//------------------------DATA CLASS--------------------
/*Crie uma data class chamada Produto com nome e preço. No main, crie um produto,  
faça uma cópia dele com preço diferente usando copy() e mostre os dois com println. */

data class Produto(val nome: String, val preco: Double)

fun main(){
    val produto1 = Produto("Tufy", 32.05)
    val produto2 = produto1.copy(nome = "W", preco = 23.43)

    println(produto1)
    println(produto2)

}



//----------------OBJETO E COMPANION-----------------------------
/*Crie uma classe chamada Usuario com os atributos nome e idade. Dentro dela, 
utilize um companion object que tenha uma função chamada criarAnonimo(), que retorna um 
usuário com nome "Anônimo" e idade 0.

- Além disso, crie um object chamado ContadorUsuarios que possua uma variável para contar 
quantos usuários foram criados e uma função para incrementar esse valor.

- No main, crie um usuário normal e um usuário anônimo usando o companion object, 
incremente o contador para cada criação e exiba o total de usuários criados. */

class Usuario(val nome: String, val idade: Int){
    
    companion object{
        fun criarAnonimo() =
            Usuario("Anonimo", 0)
    }
}

object ContadorUsuarios{
    var contador = 0

    fun incrementar(){
        contador++
        return contador
    }
}

fun main(){
    val user1 = Usuario("tufy", 20)
    var qtd = ContadorUsuarios.incrementar()
    val user2 = Usuario.criarAnonimo()
    qtd = ContadorUsuarios.incrementar()

    println(user1, user2)
    println("Total: $qtd")
    
}


//-------------------LAMBDA-----------------------
/*Crie uma lista de números inteiros. Utilize uma lambda com a função filter para gerar uma nova lista 
contendo apenas os números pares. Em seguida, use println para exibir essa nova lista. */

fun main(){
    val lista = listOf(1, 2, 3, 4, 5)

    val listaPar = lista.filter{ it % 2 == 0}
    //ouuu
    val listaPar2 = lista.filter{ lista -> lista % 2 == 0}

    println(listaPar)
}   



//------------------ENUM-----------------------
/*Crie um enum chamado NivelAcesso com os valores: ADMIN, USER e GUEST.

Crie uma função que receba um NivelAcesso e retorne uma mensagem:

ADMIN → "Acesso total"
USER → "Acesso limitado"
GUEST → "Acesso restrito"

No main, teste a função com pelo menos dois níveis diferentes e mostre o resultado com println. */

    enum class NivelAcesso{
        ADMIN, USER, GUEST
    }

    fun tipo(nivel: NivelAcesso) =
        when(nivel) {
            NivelAcesso.ADMIN -> "Acesso total"
            NivelAcesso.USER -> "Acesso limitado"
            NivelAcesso.GUEST ->  "Acesso restrito" 
        }

    fun main(){
        println(tipo(NivelAcesso.ADMIN))
        println(tipo(NivelAcesso.USER))
    }

/* Crie um enum chamado DiaSemana com os valores: SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO e DOMINGO.

Crie uma função que receba um DiaSemana e retorne:

Se for de SEGUNDA a SEXTA → "Dia útil"
Se for SABADO ou DOMINGO → "Fim de semana"

No main, teste com pelo menos dois dias diferentes e mostre o resultado com println.*/ 

enum class DiaSemana{
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
}

fun dia(day: DiaSemana) =
    when(day){
        DiaSemana.SABADO, DiaSemana.DOMINGO -> "Fim de semana"
        else -> "Dia útil"
    }

fun main(){
    println(dia(DiaSemana.SEGUNDA))
}




//----------------FUNCAO DE EXTENSAO E PROPRIEDADE DE EXTENSAO---------------
/*Crie:

uma função de extensão para Int chamada isPositivo() que retorna true se o número for maior que 0
uma propriedade de extensão para Int chamada dobro que retorna o valor multiplicado por 2

No main, teste com um número qualquer e mostre:

se ele é positivo
e o seu dobro usando println*/

fun Int.isPositivo() = this > 0

val Int.dobro: Int
    get() = 
        this * 2

fun main(){
    val ehPositivo = 2.isPositivo()
    val dobro = 2.dobro

    println(ehPositivo)
    println(dobro)
}

   


/*Crie um sistema simples de pedidos:

Crie um enum chamado StatusPedido com: PENDENTE, PAGO, CANCELADO
Crie uma data class chamada Pedido com: id (Int), valor (Double) e status (StatusPedido)

Agora:

Crie uma função de extensão para Pedido chamada isPago() que retorna true se o status for PAGO
Crie uma propriedade de extensão para Pedido chamada valorComTaxa que retorna o valor com 10% de acréscimo
Crie um object chamado ContadorPedidos com uma variável que conte quantos pedidos foram criados e uma função incrementar()

No main:

Crie 1 pedido
Incremente o contador
Mostre:
se o pedido está pago
o valor com taxa
total de pedidos criados */
enum class StatusPedido{
    PENDENTE, PAGO, CANCELADO
}

data class Pedido(val id: Int, val valor: Double, val status: StatusPedido)

fun Pedido.isPago(): Boolean{
    if(this.status == StatusPedido.PAGO){
        return true
    }else{
        return false
    }
}

val Pedido.valorComTaxa: Double
    get(){
        val acrescimo = this.valor * 0.1
        return this.valor + acrescimo
    }

object ContadorPedidos{
      var contador = 0

    fun incrementar(): Int{
        contador++
        return contador
    }
}

fun main(){
    val pedido = Pedido(1, 23.32, StatusPedido.PAGO)
    var qtd = ContadorPedidos.incrementar()

    println("Pedido está pago: ${pedido.isPago()}")
    println("Valor com taxa: ${pedido.valorComTaxa}")
    println("Total de pedidos: $qtd")
}


