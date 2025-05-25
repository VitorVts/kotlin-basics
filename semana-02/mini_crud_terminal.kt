data class Produto(val id: Int, var nome: String, var preco: Double)

private val produtos = mutableListOf<Produto>()
private var proximoId = 1

fun String.capitalizeWords(): String =
    this.lowercase().split(" ").joinToString(" ") {it.replaceFirstChar {c -> c.uppercase()}}

fun criarProduto() {
    print("Nome do produto: ")
    val nome = readLine()?.capitalizeWords()?: ""
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

fun buscarProdutoPorNome() {
    print("Digite parte do nome: ")
    val busca = readLine()?.lowercase() ?: ""

    val encontrados = produtos.filter {it.nome.lowercase().contains(busca)}

    if (encontrados.isEmpty()) {
        println("Nenhum produto encotnrado. \n")
    } else {
        encontrados.forEach{
            println("ID: ${it.id} | Nome: ${it.nome} | Preço: R$ ${it.preco}")
        }
        println()
    }
}
fun main() {
    while (true) {
        println("=== MENU ===")
        println("1. Criar produto")
        println("2. Listar produtos")
        println("3. Editar produto")
        println("4. Remover produto")
        println("5. Buscar produto por nome")
        println("0. Sair")
        print("Escolha: ")

        when (readLine()) {
            "1" -> criarProduto()
            "2" -> listarProdutos()
            "3" -> editarProduto()
            "4" -> removerProduto()
            "5" -> buscarProdutoPorNome()
            "0" -> {
                println("Saindo...")
                break
            }
            else -> println("Opção inválida\n")
        }
    }
}
