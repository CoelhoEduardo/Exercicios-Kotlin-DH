package Classes.Exercicios_Aula07.Exercicio4

class Tripe(var dobrado: Boolean, var alturaMinima: Int, var alturaMaxima: Int, var alturaAtual: Int) {


    fun definirAltura(novaAltura: Int) {
        alturaAtual = novaAltura
        if (alturaAtual < alturaMinima || alturaAtual > alturaMaxima) {
            println("Altura incompátivel com o tripé usado")
        }

    }

    fun dobrar() {
        if (dobrado) {
            println("Tripé dobrado")
        } else {
            println("Tripé não está dobrado")
        }
    }

    fun desdobrar() {
        if (dobrado == false) {
            println("Tripé Desdobrado")
        } else {
            println("Tripé não está desdobrado")
        }

    }

    fun guardar() {
        if (dobrado && alturaAtual == alturaMinima) {
            println("Tripé para ser guardado")
        } else {
            println("Altura atual não permite que o tripé seja dobrado")
        }

    }

    fun prontoParaGuardar() {
        if (dobrado && alturaAtual == alturaMinima) {
            println("Tripé está pronto para ser guardado")
        } else {
            println("Tripé não está pronto para ser guardado")
        }

    }

    fun usar() {
        if (dobrado == false && alturaAtual <= alturaMaxima && alturaAtual > 0) {
            println("Tripé será usado")
        } else {
            println("Tripe tem que ser desdobrado e ter altura máxima pela metade no minimo")
        }

    }

    fun prontoParaUsar() {
        if (dobrado == false && alturaAtual <= alturaMaxima && alturaAtual > 0) {
            println("Tripé está pronto para ser usado")
        } else {
            println("Tripé não está pronto para ser usado")
        }

    }
}