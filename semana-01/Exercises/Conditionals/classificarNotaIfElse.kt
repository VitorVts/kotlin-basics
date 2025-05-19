//🧪 Exercício 2 — Classificador de nota
//
//Objetivo: Dado um valor de nota (0 a 10), classifique:
//
//>= 9: Excelente
//
//>= 7: Bom
//
//>= 5: Regular
//
//< 5: Reprovado

fun classificaNota(nota: Double): String {
    if (nota < 5) {
        return "Reprovado"
    } else if (nota < 7) {
        return "Regular"
    } else if (nota < 9) {
        return "Bom"
    } else {
        return "Excelente"
    }
}


fun main() {
    var resultado = classificaNota(9.5)
    println(resultado)

    resultado = classificaNota(6.0)
    println(resultado)

    resultado = classificaNota(3.0)
    println(resultado)
}