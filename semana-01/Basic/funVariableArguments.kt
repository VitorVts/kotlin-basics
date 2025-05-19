//🔹 3. vararg (Argumentos Variáveis)
//
//Objetivo: aprender a lidar com múltiplos argumentos.
//🧪 Exercício 5: Crie a função somaTotal(vararg numeros: Int) que retorna a soma dos argumentos.
//🧪 Exercício 6: Crie a função formatarFrase(vararg palavras: String) que retorna as palavras concatenadas separadas por espaço.

fun somaTotal(vararg numeros: Int): Int {

    var soma = 0

    numeros.forEach { numero ->
        soma += numero
    }

    return soma
}

fun formatarFrase(vararg palavras String): String {
   val frase =  palavras.joinToString(" ")
    return frase
}

fun main() {
    val totalDireto = somaTotal(1, 2, 3, 4, 5)
    println(totalDireto)

    formatarFrase("Olá", "Mundo")
}