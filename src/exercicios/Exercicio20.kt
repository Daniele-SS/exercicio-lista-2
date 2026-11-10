package exercicios

import model.Funcionario
import model.Gerente

// 20 - Crie uma classe "Funcionario" com "nome", "salario" e uma função que retorne o salário,
// depois crie uma classe "Gerente" que herde "Funcionario" e sobrescreva a função que retorna
// o salário, retornando o salário com 20% de comissão (aumento)
fun exercicio20() {
    val funcionario = Funcionario("Pedro", 1000.0)
    val gerente = Gerente("Carla", 1000.0)

    println("Funcionário ${funcionario.nome} recebe R$ %.2f".format(funcionario.obterSalario()))
    println("Gerente ${gerente.nome} recebe R$ %.2f".format(gerente.obterSalario()))
}
