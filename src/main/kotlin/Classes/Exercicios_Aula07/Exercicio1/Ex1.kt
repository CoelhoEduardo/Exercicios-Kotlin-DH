package Classes.Exercicios_Aula07.Exercicio1


fun main() {
    val cliente1 = Cliente("Eduardo", "Santos")
    val cliente2 = Cliente("Mariana", "Vieira")
    val contaEdu = Conta(5554653, 1000.00, cliente1)
    val contaMari = Conta(5554056, 1000.00, cliente2)

    contaEdu.Deposito(50.00)
    contaMari.Deposito(100.00)
    contaMari.Saque(1100.00)
    contaEdu.Saque(150.45)


}
