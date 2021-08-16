package Classes.Exercicios_Aula09.exercicio_2

class Itens(var numeroItem: Int, var descricaoItem: String, var quantComprada: Int, var precoUni: Double) {

    fun itens() {
        if (quantComprada < 0) {
            return println(0)
        }
        if (precoUni < 0) {
            return println(0.0)
        }
    }
}