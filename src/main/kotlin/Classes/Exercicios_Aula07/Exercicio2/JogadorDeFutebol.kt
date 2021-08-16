package Classes.Exercicios_Aula07.Exercicio2

class JogadorDeFutebol(var nome: String, var energia: Int, var alegria: Int, var gols: Int, var experiencia: Int) {

    fun fazerGol(): Unit {
        energia -= 5
        alegria += 10
        gols += 1

        return println("GOOOOOOOOOOOL")

    }

    fun correr(): Unit {
        energia += 10
        return println("Cansei")
    }
}
