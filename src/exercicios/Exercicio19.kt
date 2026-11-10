package exercicios

import model.ContaBancaria

// 19 - Crie uma classe "ContaBancaria" com os atributos "nomeTitular" e "saldo" (privado)
// e crie funções para depositar um valor, sacar um valor e para consultar o saldo
fun exercicio19() {
    val conta = ContaBancaria("Maria Silva", saldoInicial = 100.0)

    conta.consultarSaldo()
    conta.depositar(50.0)
    conta.sacar(30.0)
    conta.sacar(200.0) // saldo insuficiente
    conta.depositar(-10.0) // valor inválido
    conta.consultarSaldo()
}
