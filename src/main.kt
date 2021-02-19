fun main() {
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

class Conta(
    var titular: String,
    val numeroConta: Int
) {
    var saldo = 0.0
        private set


//    construtor secundario
//    constructor(titular: String, numeroConta: Int) {
//        this.titular = titular
//        this.numeroConta = numeroConta
//    }

    fun deposita(valor: Double) {
        if(valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
        } else {
            println("Você não possui saldo o suficiente para essa transação.")
        }
    }

    fun trasferir(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }
}

fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Ariel $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }
//    Alternativa ao i < 5
//    for (i in 5 downTo 1) {
//        val titular: String = "Alex $i"
//        val numeroConta: Int = 1000 + i
//        var saldo = i + 10.0
//
//        println("titular $titular")
//        println("número da conta $numeroConta")
//        println("saldo da conta $saldo")
//        println()
//    }

//    testaCondicoes(saldo)
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }

    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}