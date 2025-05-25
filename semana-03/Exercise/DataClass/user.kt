data class Usuario(val nome: String, val email: String)


fun main() {
    val user = Usuario("Vitor","vitor@gmail.com")
    val user2 = user.copy(email = "vitorexg@gmail.com")

    println(user == user2)
    println(user.hashCode())
    println(user2.hashCode())
    
    println(user)
    println(user2)
}