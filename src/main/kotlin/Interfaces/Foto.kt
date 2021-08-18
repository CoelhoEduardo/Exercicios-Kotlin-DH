package Interfaces

class Foto : Imprimivel {
    override var nome: String = "Selfie"
    override var tipoDeDocumento: String = "do tipo Foto"
    override fun imprimir(): String {
        return ("Eu sou $tipoDeDocumento, $nome")
    }
}