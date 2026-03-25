package dataclasses

//data class -> classe usada para representar dados, gerando automaticamente métodos como equals, hashCode, toString e copy
data class Customer(val name: String, val postalCode: String)

fun main(){
    val c = Customer("João", "14806-000")
    println(c)
}