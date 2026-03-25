package objects

class MyClass{
    companion object{
        fun callMe() =
            println("Objeto companheiro")
    }
}

fun main(){
    MyClass.callMe()
}
