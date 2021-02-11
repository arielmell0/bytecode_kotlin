fun main() {
    println("Bem vindo ao Bytebank")
<<<<<<< HEAD
    //testaLacos()
    var contaAriel = Conta()
    contaAriel.titular = "Ariel"
    contaAriel.numeroConta = 5321
    contaAriel.saldo = 129.45

    var contaCamily = Conta()
    contaCamily.titular = "Camily"
    contaCamily.numeroConta = 5920
    contaCamily.saldo = 9024.91

    println(contaAriel.titular)
    println(contaAriel.numeroConta)
    println(contaAriel.saldo)

    println(contaCamily.titular)
    println(contaCamily.numeroConta)
    println(contaCamily.saldo)

    println("Depositando na conta do Ariel")
    deposita(contaAriel, 100.0)
    println(contaAriel.saldo)

    println("Depositando na conta da Camily")
    deposita(contaCamily, 300.0)
    println(contaCamily.saldo)

}

fun deposita(conta: Conta, valor: Double){
    conta.saldo += valor
}

class Conta {
    var titular = ""
    var numeroConta = 0
    var saldo = 0.0
}

fun testaLacos(){
=======
>>>>>>> parent of f000b52... POO :coffee:
    var i = 0
    while(i < 5){
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