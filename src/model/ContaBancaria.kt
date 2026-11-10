package model

class ContaBancaria(
    val nomeTitular: String,
    saldoInicial: Double = 0.0
) {
    // Privado: só pode ser alterado pelas funções da própria classe
    private var saldo: Double = saldoInicial

    fun depositar(valor: Double) {
        if (valor <= 0) {
            println("Depósito inválido: o valor deve ser maior que zero")
            return
        }
        saldo += valor
        println("Depósito de R$ %.2f realizado".format(valor))
    }

    fun sacar(valor: Double) {
        when {
            valor <= 0 -> println("Saque inválido: o valor deve ser maior que zero")
            valor > saldo -> println("Saldo insuficiente para sacar R$ %.2f".format(valor))
            else -> {
                saldo -= valor
                println("Saque de R$ %.2f realizado".format(valor))
            }
        }
    }

    // Como o saldo é privado, a leitura é feita por esta função
    fun consultarSaldo(): Double {
        println("Saldo de $nomeTitular: R$ %.2f".format(saldo))
        return saldo
    }
}
