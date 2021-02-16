fun main() {
    println("Bem vindo ao Bytebank")

    //testaLacos()
    var contaAriel = Conta()
    contaAriel.titular = "Ariel"
    contaAriel.numeroConta = 5321
    contaAriel.setSaldo(150.0)

    var contaCamily = Conta()
    contaCamily.titular = "Camily"
    contaCamily.numeroConta = 5920
    contaCamily.setSaldo(-1500.0)

    println(contaAriel.titular)
    println(contaAriel.numeroConta)
    println(contaAriel.getSaldo())

    println(contaCamily.titular)
    println(contaCamily.numeroConta)
    println(contaCamily.getSaldo())

    println("Depositando na conta do Ariel")
    contaAriel.deposita(100.0)
    println(contaAriel.getSaldo())
    contaAriel.saca(500.0)
    println("Seu novo saldo é: ${contaAriel.getSaldo()}")

    println("Depositando na conta da Camily")
    contaCamily.deposita(300.0)
    println(contaCamily.getSaldo())

    println("Transferindo da conta da Camily")
    contaCamily.trasferir(1000.0, contaAriel)
    println("Seu saldo atual é ${contaCamily.getSaldo()}")

}

class Conta {
    var titular = ""
    var numeroConta = 0
    private var saldo = 0.0

    fun deposita(valor: Double){
        this.saldo += valor
    }

    fun saca(valor: Double){
        if(valor <= saldo){
            saldo -= valor
        } else {
            println("Você não possui saldo o suficiente para essa transação.")
        }
    }

    fun trasferir(valor: Double, destino: Conta): Boolean{
        if(this.saldo >= valor){
            saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }

    fun setSaldo(valor: Double){
        if(valor > 0){
            this.saldo = valor
        }
    }

    fun getSaldo(): Double{
        return this.saldo
    }


}

fun testaLacos(){
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