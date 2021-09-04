package Function.Exercicio15

fun main() {
    val lapis = Produto("Lapis", 1.50)
    val caderno = Produto("Caderno", 15.50)
    val borracha = Produto("Borracha", 2.50)
    val caneta = Produto("Caneta", 3.00)

    val carrinhoDeCompras = CarrinhoDeCompras()
    carrinhoDeCompras.adicionarProdutos(lapis)
    carrinhoDeCompras.adicionarProdutos(caderno)
    carrinhoDeCompras.adicionarProdutos(borracha)
    carrinhoDeCompras.adicionarProdutos(caneta)

    val caixa = Caixa()
    caixa.fechamentoDeConta(
        cabecalhoDoComprovante, dataDaCompra, carrinhoDeCompras.listaDeProdutos,
        imprimeListaDeCompras, adicionaRodape
    )
}

