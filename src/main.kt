fun main() {
    testaCondicoesConta()
    var funcionarioAriel = Funcionario(nome = "Ariel", cpf = "888.888.222-111", salario = 1836.90, tipo = 0)
    println(funcionarioAriel.salario)
    println("bonificação ${funcionarioAriel.bonificacao()}")
}