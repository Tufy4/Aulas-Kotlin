fun main(){
    print("Digite a temperatura em Celsius: ")
    val celsius = readln().toDouble()

    var farenheit = 32 + ((9 * celsius) / 5)

    println("Conversao para farenheit: $farenheit")
}