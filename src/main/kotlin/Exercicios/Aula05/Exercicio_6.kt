package Exercicios.Aula05

fun main() {
    println(cemNumPositivo())
}

fun cemNumPositivo() {
    for (i in 1..100) if (i % 2 == 0){
        print(" " + i)
    }
}