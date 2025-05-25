inline fun logarExecucao(action: () -> Unit) {
    println("Iniciando Execução....")
    action()
    println("Iniciando Execução....")
}

inline fun medirExecucao(action: () -> Unit) {
    val inicio = System.nanoTime()
    action()
    val fim = System.nanoTime()
    val duracao = (fim - inicio) / 1_000_000.0
    println("Tempo de execução: $duracao ms")
}

fun main() {
    logarExecucao {
        println("Rodando uma ação qualquer...")
    }

    medirExecucao {
        Thread.sleep(500)
}
