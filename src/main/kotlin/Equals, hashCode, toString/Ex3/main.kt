package Aula12.Ex3

fun main() {
    val pessoa1 = Pessoas("Eduardo", 589645256)
    val pessoa2 = Pessoas("Eduardo", 589645256)

    println(pessoa1.toString() == pessoa2.toString())
    println(pessoa2.hashCode() == pessoa1.hashCode())

}