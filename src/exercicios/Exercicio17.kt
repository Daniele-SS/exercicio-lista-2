package exercicios

import model.Pessoa

// 17 - Crie um objeto "pessoa" com nome, idade e cidade, depois exiba uma frase com os dados
// do objeto por meio de um método: "Maria tem 25 anos e mora em São Paulo"
fun exercicio17() {
    val pessoa = Pessoa(nome = "Maria", idade = 25, cidade = "São Paulo")
    pessoa.apresentar()
}
