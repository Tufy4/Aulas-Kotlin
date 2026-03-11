fun executar(x: Int, y: Int, op: (Int, Int) -> Int): Int  {
    return op(x, y)
}

fun main(){
    val somar: (Int, Int) -> Int =  {x: Int, y: Int -> x + y}

    val mult = {x: Int, y: Int -> x * y}

    val res = executar(5, 3, mult)
    println(res)

    val res2 = executar(5, 3) {a, b -> a -b}
    println(res2)
}