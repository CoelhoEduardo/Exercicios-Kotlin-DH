package Lambdas.Ex1

fun main() {
    val soma: (Int, Int) -> Int = {x: Int, y: Int -> x + y }
    val subtracao: (Int, Int) -> Int = {x: Int, y: Int -> x - y}
    val multiplicacao: (Int, Int) -> Int = {x: Int, y: Int -> x * y}
    val divisao: (Int, Int) -> Int = {x: Int, y: Int -> x / y}


    println(soma(5,5))
    println(subtracao(10,5))
    println(multiplicacao(5, 2))
    println(divisao(10, 5))

}