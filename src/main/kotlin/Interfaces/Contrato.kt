package Interfaces

class Contrato : Imprimivel {
    override var nome: String = "Contrato de Trabalho"
    override var tipoDeDocumento: String = "do tipo Contrato"
    override fun imprimir(): String {
        return ("Eu sou $tipoDeDocumento, $nome")
    }
}