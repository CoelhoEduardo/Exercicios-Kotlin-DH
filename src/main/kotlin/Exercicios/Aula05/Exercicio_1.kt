package Exercicios.Aula05

fun main() {
    print(maiorNumero(10, 14,17))

}

fun maiorNumero(numeroA: Int, numeroB: Int, numeroC:Int): Int{
    if(numeroA > numeroB){
        return numeroA
    } else if (numeroC > numeroA) {
        return numeroC
    } else {
        return numeroB
    }
}