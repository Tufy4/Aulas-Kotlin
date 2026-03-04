fun menor(a: Int, b: Int): Int{
    if(a < b){
        return a
    }else{
        return b
    }
}

fun main(){
    print("Digite um valor: ")
    val num1 = readln().toInt()
    print("Digite outro valor: ")
    val num2 = readln().toInt()

    var menornum = menor(num1, num2)

    println("O menor é ${menornum}")


}