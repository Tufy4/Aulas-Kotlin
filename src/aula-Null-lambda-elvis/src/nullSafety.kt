fun main(){
    val s1: String = "hello"
    println(s1.uppercase())

    //safe call
    val s2: String? = "oi"
    println(s2?.uppercase())

    val s3: String? = null
    println(s3!!.uppercase())
}