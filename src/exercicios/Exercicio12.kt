package exercicios

// 12 - Escreva um programa que conte de 1 a 100 e:
//  ● Se for múltiplo de 3, mostre "Batata"
//  ● Se for múltiplo de 5, mostre "Quente"
//  ● Se for múltiplo de 3 e 5, mostre "BatataQuente"
fun exercicio12() {
    for (numero in 1..100) {
        // A verificação de 3 e 5 vem primeiro; senão o múltiplo de 15 cairia no "Batata"
        when {
            numero % 3 == 0 && numero % 5 == 0 -> println("$numero - BatataQuente")
            numero % 3 == 0 -> println("$numero - Batata")
            numero % 5 == 0 -> println("$numero - Quente")
        }
    }
}
