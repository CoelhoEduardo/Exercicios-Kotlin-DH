package Collections.Exercicios16

fun main() {
    val apelidoJoao = listOf("Juan", "El Divo", "Maromba", "Zé Bonitinho")
    val apelidoMiguel = listOf("Dark Knight", "Bruce Wayne", "Batfleck", "Gengiva")
    val apelidoMaria = listOf("Ju", "Mary", "Marilene", "Ventania")
    val apelidoLucas = listOf("Lukinha", "Jorge", "George", "Kevin Flynn")

    val apelidos = mapOf("João" to apelidoJoao, "Miguel" to apelidoMiguel, "Maria" to apelidoMaria, "Lucas" to apelidoLucas)

    for((key, value) in apelidos){
        println("$key -> $value")
    }
}