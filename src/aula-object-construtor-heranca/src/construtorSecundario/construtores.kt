package construtorSecundario

class Custumer{
    var name: String

    //construtor
    constructor(name: String?){
        this.name = name?: "Joe"
    }
}

//usa bibliotecas java(listOf)
fun main(){
    val customers = listOf(
        Custumer("Moe"),
                Custumer("Larry"),
                Custumer("Curly"),
                Custumer(null)
    )

    for(c in customers){
        println(c.name)
    }
}