package Lambdas.Ex3

fun main() {
    val listaDeNumeros = { listaDeNumeros: List<Int> ->
        var produto = 1
        if (listaDeNumeros.isEmpty()) {
            0
        } else {
            for (numero in listaDeNumeros) produto *= numero
            produto
        }
    }
    println(listaDeNumeros(listOf(2,3,4,5,6,7,8)))
}