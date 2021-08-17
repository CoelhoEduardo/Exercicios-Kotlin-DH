package ClassesAbstratas

class ingressoPadrao(val valorOriginal: Double) : Ingresso(valorIngresso = 10.50) {
    override fun imprimeValor() {
        println("Seu ingresso ficou no valor de R$ ${valorOriginal}")
        println("Bom filme :) ")
    }
}