fun main(){
    print("Digite um numero para gerar a tabuada: ")
    val numero = readln().toInt()
    var resultado: Int

    for(i in 1..10){
        resultado = numero * i
        println("${numero} * ${i} = ${resultado}")
    }
}