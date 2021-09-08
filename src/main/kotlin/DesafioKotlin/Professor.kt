package DesafioKotlin

open class Professor(var nome: String, var sobrenome: String, var tempoDeCasa: Int, var codigoDeProfessor: Int) {

}

class ProfTitular(var especialidade: String) : Professor("Antonio", "Luiz", 10, 539) {

}

class ProfAdjunto(var horasDeMonitoria: Int) : Professor("Maria", "Santos", 1, 321) {

}
