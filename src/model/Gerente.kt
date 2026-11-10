package model

// Gerente herda de Funcionario e repassa nome e salário para o construtor pai
class Gerente(
    nome: String,
    salario: Double
) : Funcionario(nome, salario) {

    // Sobrescreve a função do pai: salário + 20% de comissão
    override fun obterSalario(): Double = salario * 1.20
}
