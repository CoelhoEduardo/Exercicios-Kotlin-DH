package Collections.Exercicios16

fun main() {

    val loteriaDosSonhos =
        mapOf<Int, String>(0 to "Ovo",
            1 to "Água",
            2 to "Escopeta",
            3 to "Cavalo",
            4 to "Dentista",
            5 to "Fogo")
    for ((key, value ) in loteriaDosSonhos){
        println("$key -> $value")
    }
}