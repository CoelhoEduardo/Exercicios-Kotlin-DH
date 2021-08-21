package Lambdas.Ex3

fun main() {
    val listaDeNumeros: (List<Int>) -> Unit = {
        for (item in it){
            if (item % 2 != 0){
                println(item)
            }
        }
    }
    listaDeNumeros(listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19))
}