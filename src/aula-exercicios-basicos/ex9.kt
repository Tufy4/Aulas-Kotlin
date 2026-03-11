fun main(){
    println("Digite um ano aleatorio(ex: 2025)")
    val ano = readln().toInt()

    if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
        println("ANO BISSEXTO")
    }
}