class Funcionario(
    var nome: String,
    var cpf: String,
    var salario: Double
) {
    fun bonificacao(): Double {
        return this.salario * 0.1
    }
}