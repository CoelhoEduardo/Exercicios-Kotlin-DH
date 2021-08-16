package Exercicios.Aula05

fun main() {
    print(analiseNum(10, 1, 3, 2))

}

fun analiseNum(numA: Int, numB: Int, numC: Int, numD: Int): Boolean {
    if (numA > numC && numA > numD) {
        return true
    } else return numB > numC && numB > numD
}