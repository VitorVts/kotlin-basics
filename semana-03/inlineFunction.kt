inline fun medirTempo(acao: () -> Unit) {
    val inicio = System.currentTimeMillis()
    acao()
    val fim = System.currentTimeMillis()
    println("Tempo: ${fim - inicio}ms")
}

fun main() {
    medirTempo {
        println("Executando tarefa pesada.....")
        Thread.sleep(500)
    }
}