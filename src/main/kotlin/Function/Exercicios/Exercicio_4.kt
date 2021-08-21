package Exercicios.Aula05

fun main() {
    println(cemImpares())
}

fun cemImpares(): Unit {
    for (i in 1..100) if (i % 2 != 0) print(" " + i)
}
