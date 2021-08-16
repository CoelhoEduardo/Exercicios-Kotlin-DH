package Classes.Exercicios_Aula09.exercicio_2

fun main() {

    val itens = listOf<Itens>(
        Itens(1, "Lapis", 3, 2.50),
        Itens(2, "Borra", 3, 3.50),
        Itens(3, "Caneta Bic", 4, 2.50),
        Itens(4, "Caderno", 2, 25.75)
    )
    val fatura = Fatura(itens)
    val total = fatura.totalDaFatura()

    println("Fatura total foi de = R$$total")

}