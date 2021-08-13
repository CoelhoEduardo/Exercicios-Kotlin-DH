package Classes.Exercicios_Aula07.Exercicio3

class Prova(var dificuldade: Int, var energiaNecessaria: Int) {
    fun podeRealizar(Atleta: Atleta){
        val char = Atleta
        if (char.nivel >= dificuldade && char.energia >= energiaNecessaria){
             println("Pode realizar a prova")
        }else {
            println("Não pode realizar a prova")
        }

    }
}