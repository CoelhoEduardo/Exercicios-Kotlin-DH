package Exercicios.Aula05

fun main() {

    print(textAnalise("Eu me chamo Eduardo e voce ?", "Eu me chamo Eduardo e voce ?" ))

}

fun textAnalise(textA: String, textB: String): Boolean{
    return textA == textB
}
