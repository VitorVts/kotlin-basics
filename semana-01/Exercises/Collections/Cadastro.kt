fun main() {
    val nomesCadastrados = mutableListOf<String>()
    val emailsCadastrados = mutableSetOf<String>()
    val usuarios = mutableMapOf<String, String>()

    fun cadastrar(nome: String, email: String) {
        if(email in emailsCadastrados)
        {
            println("Email Já cadastrado!")
        } else {
            nomesCadastrados.add(nome)
            emailsCadastrados.add(email)
            usuarios[nome] = email
            println("Usuário caastrado com sucesso: $nome -> $email")
        }
    }

    cadastrar("Ana","ana@email.com")
    cadastrar("Maria", "maria@email.com")
    cadastrar("Carlos", "carlos@email.com")
    cadastrar("Ana", "ana@email.com")

    println("\n Ordem de cadastro: $nomesCadastrados")
    println("Emails únicos: $emailsCadastrados")
    println("Mapa de Usuários:")
    for((nome,email) in usuarios) {
        println("-$nome -> $email")
    }
}