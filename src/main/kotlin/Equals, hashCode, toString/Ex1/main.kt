package Aula12

import Aula12.Ex1.Pessoa

fun main() {
    val pessoa = Pessoa("Eduardo",485722325 )
    val pessoa2 = Pessoa("Maria", 485722325)
    val pessoa3 = pessoa

    println("Validação: ")
    println(pessoa == pessoa2)
    println(pessoa3 == pessoa)
    println("----------------")
    println("Dados Completos: ")
    println(pessoa)
    println(pessoa2)
    println("----------------")
    println("Numero do RG: ")
    println(pessoa.hashCode())
    println(pessoa2.hashCode())
}