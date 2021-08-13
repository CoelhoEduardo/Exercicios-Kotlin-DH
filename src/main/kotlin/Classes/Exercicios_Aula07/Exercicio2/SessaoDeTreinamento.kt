package Classes.Exercicios_Aula07.Exercicio2

class SessaoDeTreinamento(var experiencia: Int) {

    fun treinoA(jogadorDeFutebol: JogadorDeFutebol){
        val jogador = jogadorDeFutebol
        println("Experiencia Inicial ${jogador.experiencia}")
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        experiencia++
        println("Experiencia Final $experiencia")
    }
}