fun main(){
    print("Digite o seu peso: ")
    val peso = readln().toDouble()

    print("Digite a sua altura: ")
    val altura = readln().toDouble()

    var imc = peso / (altura * altura)

    when{
        imc < 18.5 -> println("Abaixo do peso")
        imc >= 18.5 && imc < 25.0 -> println("Eutrófico")
        imc >= 25.0 && imc < 30.0 -> println("Sobrepeso")
        imc >= 30.00 -> println("Obesidade")
    }
}