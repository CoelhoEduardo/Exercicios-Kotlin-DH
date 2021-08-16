package Classes

class Aluno(var nome: String, var idade: Int) {

    var curso: String = "DHOUSE ANDROID DEV"
    var matricula: String = "ASASA23312"

    constructor(nome: String, idade: Int, curso: String) : this(nome, idade) {
        this.curso = curso
    }

    constructor(nome: String, idade: Int, curso: String, matricula: String) : this(nome, idade, curso) {
        this.matricula = matricula
    }
}