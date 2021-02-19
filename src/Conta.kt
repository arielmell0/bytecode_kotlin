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