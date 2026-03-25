package interfaces

interface Clickable{
    fun click()
    fun show() {
        println("Hello concreto")
    }
}


class Button : Clickable {
    override fun click() {
        println("clique detectado")
    }
}

class Button2 : Clickable {
    override fun click() {
        println("clique top")
    }
}



fun fireEvent(o: Clickable){
    o.click()
}

fun main(){
    val btn = Button2()
    fireEvent(btn)
    btn.show()
}