fun main(){
    print("Digite o raio do circulo: ")
    val raio = readln().toDouble()

    var area = 3.14159 * (Math.pow(raio, 2.0))

    println("Area do circulo: $area")
}