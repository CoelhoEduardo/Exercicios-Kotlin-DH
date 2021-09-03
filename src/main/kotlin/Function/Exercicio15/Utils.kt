package Function.Exercicio15

import java.util.*
import java.util.Calendar.DATE
import java.util.Calendar.MONTH
import java.util.Calendar.YEAR

val cabecalhoDoComprovante: () -> String = {
    ("##########DH SuperMarket##########")
}

val dataDaCompra: () -> String = {
    val data = Calendar.getInstance()
    "${data.get(DATE)}/${data.get(MONTH)}/${data.get(YEAR)}"
}

val imprimeListaDeCompras: ( lista: ArrayList<Produto>) -> Unit = {
    for (item in it) {
        println("${item.nome}: R$${item.preco}")
    }
val adicionaRodape: (lista: ArrayList<Produto>) -> Unit = {
    var total = 0.0
    for (item in it){
        total += item.preco
    }
    total

}

}