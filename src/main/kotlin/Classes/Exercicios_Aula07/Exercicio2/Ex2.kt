package Classes.Exercicios_Aula07.Exercicio2

fun main() {
    val jogador1 = JogadorDeFutebol("Edu", 100, 100, 0, 5)
    println("Jogador: ${jogador1.nome}")
    val treinoEdu = SessaoDeTreinamento(jogador1.experiencia)
    treinoEdu.treinoA(jogador1)
    println("=====================================")
    val jogador2 = JogadorDeFutebol("Kaka", 100, 100, 0,10)
    println("Jogador: ${jogador2.nome}")
    val treinoKa = SessaoDeTreinamento(jogador2.experiencia)
    treinoKa.treinoA(jogador2)
}