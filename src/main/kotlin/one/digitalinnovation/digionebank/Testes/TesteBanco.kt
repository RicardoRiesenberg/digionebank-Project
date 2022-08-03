package one.digitalinnovation.digionebank.Testes

import one.digitalinnovation.digionebank.Banco

fun main(){

    val dig1OneBank = Banco(nome="DigiOne" , numero = 12)
    println(dig1OneBank.nome)
    println(dig1OneBank.numero)

    val banco2 = dig1OneBank.copy(nome= "Banco2")

    println(banco2.info())



}