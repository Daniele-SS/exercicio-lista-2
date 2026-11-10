package model

// "open" permite que outras classes herdem de Funcionario
open class Funcionario(
    val nome: String,
    protected val salario: Double // protected: visível só nesta classe e nas filhas
) {
    // "open" permite que a função seja sobrescrita nas classes filhas
    open fun obterSalario(): Double = salario
}
