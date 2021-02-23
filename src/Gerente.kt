class Gerente(
    val nome: String,
    val cpf: String,
    var salario: Double,
    var senha: Int
) {

    fun bonificacao(): Double {
        return this.salario * 0.2
    }

    fun autenticacao(senha: Int): Boolean {
        if(senha == this.senha){
            return true
        }
        return false
    }
}