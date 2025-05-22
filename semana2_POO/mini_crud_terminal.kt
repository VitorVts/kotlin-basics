data class Produto(val id: Int, var nome: String, var preco: Double)

val produtos = mutableListOf<Produto>()
var proximoId = 1

fun criarProduto() {
    print("Nome do produto: ")
    val nome = readLine() ?: ""
    print("Preço: ")
    val preco = readLine()?.toDoubleOrNull() ?: 0.0

    val novo = Produto(proximoId++, nome, preco)
    produtos.add(novo)
    println("Produto criado com sucesso!\n")
}

fun listarProdutos() {
    if (produtos.isEmpty()) {
        println("Nenhum produto cadastrado.\n")
    } else {
        produtos.forEach {
            println("ID: ${it.id} | Nome: ${it.nome} | Preço: R$ ${it.preco}")
        }
        println()
    }
}

fun editarProduto() {
    print("ID do produto para editar: ")
    val id = readLine()?.toIntOrNull()
    val produto = produtos.find { it.id == id }

    if (produto != null) {
        print("Novo nome (${produto.nome}): ")
        val novoNome = readLine()
        print("Novo preço (${produto.preco}): ")
        val novoPreco = readLine()?.toDoubleOrNull()

        if (!novoNome.isNullOrBlank()) produto.nome = novoNome
        if (novoPreco != null) produto.preco = novoPreco

        println("Produto atualizado!\n")
    } else {
        println("Produto não encontrado.\n")
    }
}

fun removerProduto() {
    print("ID do produto para remover: ")
    val id = readLine()?.toIntOrNull()
    val removido = produtos.removeIf { it.id == id }

    if (removido) println("Produto removido.\n")
    else println("Produto não encontrado.\n")
}

fun main() {
    while (true) {
        println("=== MENU ===")
        println("1. Criar produto")
        println("2. Listar produtos")
        println("3. Editar produto")
        println("4. Remover produto")
        println("0. Sair")
        print("Escolha: ")

        when (readLine()) {
            "1" -> criarProduto()
            "2" -> listarProdutos()
            "3" -> editarProduto()
            "4" -> removerProduto()
            "0" -> {
                println("Saindo...")
                break
            }
            else -> println("Opção inválida\n")
        }
    }
}
