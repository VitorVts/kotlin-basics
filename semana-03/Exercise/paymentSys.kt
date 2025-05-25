interface Pagamento {
    fun processar(valor: Double)
}

abstract class Transacao(val id: Int, val valor: Double) {
    fun info() = println("Transação #$id de R$ $valor")
}

class Pix(id: Int, valor: Double): Transacao(id, valor), Pagamento {
    override fun processar(valor: Double) {
        println("Pagando via Pix: R$ $valor")
    }
}

data class Cliente(val nome: String, val cpf: String)

inline fun log(acao: ()-> Unit) {
    println("Inicio log")
    acao()
    println("Fim Log")
}

fun main() {
    val cliente = Cliente("Vitor", "123.456.789-00")
    val pagamento = Pix(1,200.0)

    println("Cliente: $cliente")
    pagamento.info()

    log {
        pagamento.processar(pagamento.valor)
    }
}