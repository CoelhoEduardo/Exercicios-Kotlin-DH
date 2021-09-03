import java.util.*

fun recebeNumero(): Int{
    val scanner = Scanner(System.`in`)
    println("Digite um numero inteiro: ")
    val valorDigitado = scanner.nextInt()
    if (valorDigitado != scanner.nextInt()){
        return 0
    }else{
        return valorDigitado
    }

}

fun main() {
    recebeNumero()
}