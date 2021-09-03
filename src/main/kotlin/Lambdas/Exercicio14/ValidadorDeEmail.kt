package Lambdas.Ex2

fun main() {

    val validaEmail: (String) -> Boolean = {
        it.contains("@")

    }

    println(validaEmail("eduardo.coelho@javendeu.com"))
}
