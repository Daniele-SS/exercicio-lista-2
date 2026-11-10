package exercicios

// 16 - Dada uma variável numérica, calcule o seu fatorial (ex: 5! = 5 * 4 * 3 * 2 * 1 = 120)
fun exercicio16() {
    val numero = 5
    var fatorial = 1L // Long para suportar números maiores (até 20!)

    // Multiplica do número até 1: 1*5=5, 5*4=20, 20*3=60, 60*2=120, 120*1=120
    for (valor in numero downTo 1) {
        fatorial *= valor
    }

    val conta = (numero downTo 1).joinToString(" * ")
    println("$numero! = $conta = $fatorial")
}
