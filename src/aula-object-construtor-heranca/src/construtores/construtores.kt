package construtores

open class Button(val label: String)

//label: String é apenas o nome do parametro passado, por isso n usa "val"
class RadioButton(label: String) : Button(label)

fun main(){
    val btn = RadioButton("Ativado")
    println(btn.label)
}