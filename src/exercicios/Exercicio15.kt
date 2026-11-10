package exercicios

// 15 - Dada uma lista de idades, calcule a média dos maiores de idade
fun exercicio15() {
    val idades = listOf(12, 29, 32, 9, 18, 45, 16)

    // Maior de idade: 18 anos ou mais
    val maioresDeIdade = idades.filter { it >= 18 }

    if (maioresDeIdade.isEmpty()) {
        println("Não há maiores de idade na lista")
        return
    }

    // average() já devolve Double: soma / quantidade
    val media = maioresDeIdade.average()

    println("Idades: $idades")
    println("Maiores de idade: $maioresDeIdade")
    println("Média dos maiores de idade: %.2f".format(media))
}
