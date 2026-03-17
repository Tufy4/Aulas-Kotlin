package exercicios
/*
Exercício 4. Defina uma propriedade de extensão para a classe `Double` chamada `milesToKm`.
Essa propridade deve retornar a quantidade de quilômetros correspondente a uma distância em
milhas (km = milhas * 1.6)
 */
val Double.milesToKm: Double
    get() =
        this * 1.6


fun main(){
    val milhas = 10.4.milesToKm
    println("Em KM é: $milhas")

}