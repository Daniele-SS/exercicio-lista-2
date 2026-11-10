package exercicios

import model.Produto

// 18 - Crie um array de objetos representando produtos (nome e preço)
// e mostre o nome do produto mais caro
fun exercicio18() {
    val produtos = arrayOf(
        Produto("Pão", 1.00),
        Produto("Ovo", 5.00),
        Produto("Leite", 12.00),
        Produto("Queijo", 9.90)
    )

    // Começa considerando o primeiro como o mais caro e compara com os demais
    var maisCaro = produtos[0]
    for (produto in produtos) {
        if (produto.preco > maisCaro.preco) {
            maisCaro = produto
        }
    }

    // Forma alternativa, com função pronta: produtos.maxBy { it.preco }
    println("Produto mais caro: ${maisCaro.nome} (R$ %.2f)".format(maisCaro.preco))
}
