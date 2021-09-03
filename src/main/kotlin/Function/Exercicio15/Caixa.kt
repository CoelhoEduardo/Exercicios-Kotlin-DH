package Function.Exercicio15

import java.util.ArrayList

class Caixa() {

    inline fun fechamentoDeConta(
        cabecalhoDoComprovante: () -> String,
        dataDaCompra: () -> String,
        listaDeProdutos: ArrayList<Produto>,
        imprimeListaDeCompras: (ArrayList<Produto>) -> Unit,
        adicionaRodape: (ArrayList<Produto>) -> Unit
    ) {
        cabecalhoDoComprovante.invoke()
        println(dataDaCompra.invoke())
        imprimeListaDeCompras.invoke(listaDeProdutos)
        println("R$${adicionaRodape.invoke(listaDeProdutos)}")


    }
}


