package model

class Pessoa(
    val nome: String,
    val idade: Int,
    val cidade: String
) {
    // Método que exibe a frase com os dados do objeto
    fun apresentar() {
        println("$nome tem $idade anos e mora em $cidade")
    }
}
