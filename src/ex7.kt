fun main(){
    print("Digite a 1º nota: ")
    val num1 = readln().toDouble()
    print("Digite a 2º nota: ")
    val num2 = readln().toDouble()

    var media = (num1 + num2) / 2

    if(media >= 6.0){
        println("Aluno aprovado com média: ${media}")
    }else{
        println("Aluno reprovado com média: ${media}")
    }
}