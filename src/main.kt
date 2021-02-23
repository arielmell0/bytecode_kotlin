fun main() {
    testaCondicoesConta()
    var funcionarioAriel = Funcionario(nome = "Ariel", cpf = "888.888.222-111", salario = 1836.90, tipo = 0)
    println(funcionarioAriel.salario)
    println("bonificação ${funcionarioAriel.bonificacao()}")

    var gerenteCamily = Gerente(nome = "Camily", cpf = "843.999.222-44", salario = 5402.82, senha = 12345)

    println("Salário Camily ${gerenteCamily.salario}")
    println("Bonificação ${gerenteCamily.bonificacao()}")
    println("Autenticação ${gerenteCamily.autenticacao(senha = 12345)}")
}