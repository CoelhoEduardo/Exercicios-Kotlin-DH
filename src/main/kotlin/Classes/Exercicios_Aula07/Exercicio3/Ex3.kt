package Classes.Exercicios_Aula07.Exercicio3

fun main() {
    val atleta1 = Atleta("Eduardo", 10, 10)
    println("Atleta: ${atleta1.nome}")
    val prova01 = Prova(8,8)
    val prova02 = Prova(11, 10)
    val prova03 = Prova(9,11)
    prova01.podeRealizar(atleta1)
    prova02.podeRealizar(atleta1)
    prova03.podeRealizar(atleta1)
    println("==============================")
    var atleta2 = Atleta("Mariana", 15, 5)
    println("Atleta: ${atleta2.nome}")
    var prova001 = Prova(12,7)
    val prova002 = Prova(14, 4)
    val prova003 = Prova(12,4)
    prova001.podeRealizar(atleta2)
    prova002.podeRealizar(atleta2)
    prova003.podeRealizar(atleta2)
}