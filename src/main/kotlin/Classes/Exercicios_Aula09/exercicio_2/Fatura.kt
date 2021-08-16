package Classes.Exercicios_Aula09.exercicio_2

class Fatura(var listaDeItens: List<Itens>) {
    var total = 0.0
    fun totalDaFatura(): Double {
        for (Itens in listaDeItens)
            total += Itens.precoUni * Itens.quantComprada
        return total
    }
}