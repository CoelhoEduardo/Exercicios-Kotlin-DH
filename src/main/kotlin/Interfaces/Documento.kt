package Interfaces

class Documento : Imprimivel {
    override var nome: String = "CPF"
    override var tipoDeDocumento: String = "do tipo Documento"
    override fun imprimir(): String {
        return ("Eu sou $tipoDeDocumento, $nome")
    }
}