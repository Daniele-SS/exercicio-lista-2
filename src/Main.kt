import exercicios.*

fun main() {
    executar("12 - Batata Quente") { exercicio12() }
    executar("13 - Lista de ímpares") { exercicio13() }
    executar("14 - Total da compra") { exercicio14() }
    executar("15 - Média dos maiores de idade") { exercicio15() }
    executar("16 - Fatorial") { exercicio16() }
    executar("17 - Objeto Pessoa") { exercicio17() }
    executar("18 - Produto mais caro") { exercicio18() }
    executar("19 - Conta bancária") { exercicio19() }
    executar("20 - Funcionário e Gerente") { exercicio20() }
}

// Imprime um cabeçalho e executa o exercício
fun executar(titulo: String, exercicio: () -> Unit) {
    println("\n===== Exercício $titulo =====")
    exercicio()
}
