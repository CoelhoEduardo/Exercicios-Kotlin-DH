package Classes.Exercicios_Aula07.Exercicio1

import java.util.function.DoubleUnaryOperator

class Conta(var numeroConta: Int, var saldo: Double, var titular: Cliente) {

    fun Deposito(quantDinheiro: Double): Unit {
        var deposito = quantDinheiro
        deposito += saldo
        return println("Foi realizado um Deposito e o seu novo saldo é de R$${deposito} ")
    }

    fun Saque(quantiDinheiro: Double): Unit {
        var saque = quantiDinheiro
        var totalFinal = saldo - saque
        if (saque > saldo) {
            println("Saldo insuficiente")
        } else {
            println("Foi realizado um Saque e o seu novo saldo é de R$${totalFinal}")
        }
    }
}