package Classes.Exercicios_Aula6

class Ex1_Aposentadoria(var idade: Int, var sexo: String, var anoDeContribuicao: Int){

    fun contAposentadoria(): Unit{
        if (sexo == "Masculino" && idade == 65 ||  anoDeContribuicao == 30){
            print( "Verdadeiro  " )
        }else if (sexo == "Feminino" && idade == 60 || anoDeContribuicao == 30) {
            print("Verdadeiro  ")
        }else {
            print("Falso  ")
        }
    }
}