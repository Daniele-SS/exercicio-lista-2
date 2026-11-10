package exercicios

// 13 - Dada uma lista de números, crie uma nova lista apenas com os ímpares
fun exercicio13() {
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Ímpar: o resto da divisão por 2 é diferente de 0
    val impares = numeros.filter { it % 2 != 0 }

    println("Lista original: $numeros")
    println("Lista de ímpares: $impares")
}
