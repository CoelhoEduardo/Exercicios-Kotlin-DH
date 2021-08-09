package Classes.Exercicios_Aula6

fun main() {
    println("EXERCICIO 1 : ")
    val aposentadoria = Ex1_Aposentadoria(50, "Feminino", 30)

    println(aposentadoria.contAposentadoria())

    println()

    println("EXERCICIO 2 : ")
    val multiplicacao = Ex2_Multiplicacao(listOf(4,5,7))

    println(multiplicacao.produto())
}

