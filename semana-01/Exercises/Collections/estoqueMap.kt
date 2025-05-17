fun adicionaEstoque(nome: String, quantidade: Int,estoque:MutableMap<String, Int>) {

    estoque[nome] = quantidade
}

fun atualizaQuantidadeProduto(nome: String, quantidade: Int, estoque:MutableMap<String, Int>) {
    estoque[nome] = quantidade
}

fun showProdutos(estoque: Map<String, Int>) {
    for ((nome, quantidade) in estoque) {
        println("Produto: $nome | Quantidade: $quantidade")
    }
}

fun searchProdutoQuantidade(estoque: MutableMap<String, Int>, nome:String) {

    val qtd = estoque[nome]
    println("O Produto $nome tem $qtd itens em estoque")
}

fun deleteProduto(estoque: MutableMap<String, Int>, nome:String) {
    estoque.remove(nome)
}

fun main() {
    val estoque = mutableMapOf<String, Int>()
    adicionaEstoque("CPU",2,estoque)
    adicionaEstoque("Placa Mae",2,estoque)
    adicionaEstoque("Memoria Ram",2,estoque)
    adicionaEstoque("Fonte",2,estoque)

    showProdutos(estoque)
    atualizaQuantidadeProduto("CPU",5,estoque)

    showProdutos(estoque)
    searchProdutoQuantidade(estoque,"CPU")
    deleteProduto(estoque,"CPU")
    showProdutos(estoque)
}