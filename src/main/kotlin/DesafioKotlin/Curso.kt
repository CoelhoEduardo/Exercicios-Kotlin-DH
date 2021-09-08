package DesafioKotlin

class Curso(var nome: String, var codigoDoCurso: Int) {
    var numeroMaxDeAlunos: Int = 20
    val profTitular = ProfTitular("Historia")
    val profAdjunto = ProfAdjunto(100)
    val listaDeAlunos = ArrayList<Aluno>()

    constructor( nome: String, codigoDoCurso: Int,  numeroMaxDeAlunos: Int ): this(nome, codigoDoCurso){
        this.numeroMaxDeAlunos = numeroMaxDeAlunos

    }

    fun listarAlunos(alunos:Aluno){
        listaDeAlunos.add(alunos)
    }
}