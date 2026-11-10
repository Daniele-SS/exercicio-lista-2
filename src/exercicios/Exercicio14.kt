package exercicios

// 14 - Dada uma lista de preços, calcule o total da compra
fun exercicio14() {
    val precos = mapOf(
        "Arroz" to 25.90,
        "Feijão" to 8.50,
        "Leite" to 5.49,
        "Café" to 18.75
    )

    // Soma apenas os valores do mapa
    val total = precos.values.sum()

    precos.forEach { (produto, preco) -> println("$produto: R$ %.2f".format(preco)) }
    println("Total da compra: R$ %.2f".format(total))
}
