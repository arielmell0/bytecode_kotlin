class Funcionario(
    var nome: String,
    var cpf: String,
    var salario: Double,
    var tipo: Int //01 = funcionário, 02 = gerente, 03 = diretor
) {
    fun bonificacao(): Double {
        return when (tipo) {
            0 -> {
                this.salario * 0.1
            }
            1 -> {
                this.salario * 0.2
            }
            else -> {
                this.salario * 0.3
            }
        }

    }
}