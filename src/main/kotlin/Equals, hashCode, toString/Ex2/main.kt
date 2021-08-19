package Aula12.Ex2

fun main() {
    val coca1 = Coca(2, 8.80)
    val coca2 = Coca(2, 9.50)


    println("Validação: ")
    println(coca1 == coca2)
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~")
    println("Dados Completos: ")
    println(coca1.toString())
    println(coca2.toString())
    println("~~~~~~~~~~~~~~~~~~~~~~~~~~")
    println("Tamanho em (L)")
    println(coca1.hashCode())
    println(coca2.hashCode())

    println("""Resposta: 
        |Realizando a validação com Equals retornou um valor TRUE, sendo que sem o subscrever o Equals deu FALSE
        |Porque ele indicou que um dos objetos eram iguais.""".trimMargin())
}