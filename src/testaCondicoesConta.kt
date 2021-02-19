fun testaCondicoesConta() {
    println("Bem vindo ao Bytebank")

    //testaLacos()
    var contaAriel = Conta(titular = "Ariel", numeroConta = 1000)
    contaAriel.deposita(150.0)

    var contaCamily = Conta(numeroConta = 1001, titular = "Camily Lummertz")
    contaCamily.deposita(2000.0)

    println(contaAriel.titular)
    println(contaAriel.numeroConta)
    println(contaAriel.saldo)

    println(contaCamily.titular)
    println(contaCamily.numeroConta)
    println(contaCamily.saldo)

    println("Depositando na conta do Ariel")
    contaAriel.deposita(valor = 200.0)
    println(contaAriel.saldo)
    contaAriel.saca(500.0)
    println("Seu novo saldo é: ${contaAriel.saldo}")

    println("Depositando na conta da Camily")
    contaCamily.deposita(valor = 500.0)
    println(contaCamily.saldo)

    println("Transferindo da conta da Camily")
    contaCamily.trasferir(destino = contaAriel, valor = 60.0)
    println("Seu saldo atual é ${contaCamily.saldo}")
}