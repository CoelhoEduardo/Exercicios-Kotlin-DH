package Aula12.Ex1

class Pessoa(var nome: String, var rg: Int) {
    //resultado1: "False" e "True" sem a validação da subscrita equals
    //resultado2: "True" e "True com a validação do equals

    override fun equals(other: Any?): Boolean {
        return (other is Pessoa && other.rg == this.rg)
    }

    override fun toString(): String {
        return "Nome: $nome  // RG: $rg"
    }

    override fun hashCode(): Int {
        return this.rg
    }
}





