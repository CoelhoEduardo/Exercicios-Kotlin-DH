package ClassesAbstratas

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println(
        """
        1 - Ingresso Padrão 
        2 - Ingresso Vip
    """.trimIndent()
    )
    when (scanner.nextInt()) {
        1 -> ingressoPadrao(10.50).imprimeValor()
        2 -> ingressoVip(5.50).imprimeValor()

        else -> {
            println("Valor Original")
        }

    }


}