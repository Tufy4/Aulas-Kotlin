fun isLeapYear(ano: Int): Boolean{
    if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
       return true
    }
    return false
}


fun main(){
    println("Digite um ano aleatorio(ex: 2025)")
    val ano = readln().toInt()

    var bissexto = isLeapYear(ano)

    if(bissexto == true){
        println("Bissexto")
    }else{
        println("Não é bissexto")
    }
}