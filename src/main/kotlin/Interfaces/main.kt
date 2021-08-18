package Interfaces

fun main() {
    val foto = Foto()
    val documento = Documento()
    val contrato = Contrato()

    val impressora = Impressora()
    impressora.imprimivel(foto)
    impressora.imprimivel(documento)
    impressora.imprimivel(contrato)

    println("""
        ~~~~~~~~~~~~~~~~~~
        IMPRESSORA PADRÃO:
        ~~~~~~~~~~~~~~~~~~
    """.trimMargin())
    println("-----------------------")
    impressora.imprimir()
    println("-----------------------")

}