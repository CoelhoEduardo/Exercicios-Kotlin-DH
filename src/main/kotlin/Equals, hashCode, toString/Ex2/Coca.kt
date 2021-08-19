package Aula12.Ex2

class Coca(var tamanho: Int, var preco: Double) {
    // resultado 1 : false
    // resultado 2 : true


    override fun equals(other: Any?): Boolean {
        return (other is Coca && other.tamanho == this.tamanho)
    }

    override fun toString(): String {
        return "Tamanho da Coca: $tamanho L // Preço: $preco"
    }

    override fun hashCode(): Int {
        return this.tamanho
    }

}