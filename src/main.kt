fun main(){
    println("Bem vindo ao Bytebank")
    val titular: String = "Ariel"
    val numeroConta: Int = 1000
    var saldo = 0.0
    saldo = 100 + 2.0
    saldo += 200

    println("titular $titular")
    println("número da conta $numeroConta")
    println("saldo da conta $saldo")

    if (saldo > 0.0){
        println("Conta é positiva")
    } else if (saldo == 0.0){
        println("Conta é neutra")
    } else {
        println("Conta é negativa")
    }
}