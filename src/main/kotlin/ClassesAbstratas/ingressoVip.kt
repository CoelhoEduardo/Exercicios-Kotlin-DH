package ClassesAbstratas

class ingressoVip(var valorVip: Double) : Ingresso() {
    override fun imprimeValor() {
        println("Seu ingresso Vip ficou por R$${valorVip + valorIngresso}")
        println("Bom filme :)")

    }
}