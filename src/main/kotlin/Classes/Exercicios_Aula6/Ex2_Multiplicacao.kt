package Classes.Exercicios_Aula6

class Ex2_Multiplicacao(var listaNumeros: List<Int>){
    var produto: Int = 1

    fun produto(): Int{
        if (listaNumeros.isEmpty()){
            return 0
        } else{
            for (numero in listaNumeros){
                produto *= numero
            }
        }
        return produto

    }
}