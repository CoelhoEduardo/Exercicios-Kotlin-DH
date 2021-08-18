package Interfaces

class Impressora {
    var listaimprimivel = mutableListOf<Imprimivel>()

    fun imprimivel(imprimivel: Imprimivel) {
        listaimprimivel.add(imprimivel)

    }

    fun imprimir() {
        for (imprimivel in listaimprimivel) {
            println(imprimivel.imprimir())
        }
    }

}