interface BibliotecaOperacoes {
    fun emprestarLivro()
    fun devolverLivro()
    fun mostrarStatus()
}

inline fun logAcao(acao: String, bloco: () -> Unit){
    println("Iniciando... $acao")
    bloco()
    println("Finalizando... $acao")
}

data class Leitor (val nome: String, val id: Int)

abstract class Livro(
    val leitor: Leitor,
    val titulo: String,
    var statusEmprestado: Boolean
) : BibliotecaOperacoes {

    override fun mostrarStatus() {
        logAcao("Verificando status") {
            if (statusEmprestado)
                println("O livro '$titulo' está emprestado.")
            else
                println("O livro '$titulo' está disponível.")
        }
    }

    override fun emprestarLivro() {
        logAcao("Emprestando o livro") {
            if (statusEmprestado) {
                println("O livro '$titulo' já está emprestado.")
            } else {
                statusEmprestado = true
                println("${leitor.nome} pegou o livro '$titulo' emprestado.")
            }
        }
    }

    abstract override fun devolverLivro()
}


class LivroFisico(leitor: Leitor, titulo: String) : Livro(leitor, titulo, false) {
    override fun devolverLivro() {
        logAcao("Devolvendo livro físico") {
            if (!statusEmprestado) {
                println("O livro '$titulo' já está disponível.")
            } else {
                statusEmprestado = false
                println("Livro físico '$titulo' devolvido à biblioteca.")
            }
        }
    }
}

class LivroDigital(leitor: Leitor, titulo: String) : Livro(leitor, titulo, false) {
    override fun devolverLivro() {
        logAcao("Devolvendo livro digital") {
            if (!statusEmprestado) {
                println("O livro '$titulo' já está disponível.")
            } else {
                statusEmprestado = false
                println("Livro digital '$titulo' devolvido na nuvem.")
            }
        }
    }
}



fun main() {
    val leitor1 = Leitor("Vitor", 1)
    val livro1 = LivroFisico(leitor1, "Clean Code")

    livro1.mostrarStatus()
    livro1.emprestarLivro()
    livro1.mostrarStatus()
    livro1.devolverLivro()
    livro1.mostrarStatus()
}

