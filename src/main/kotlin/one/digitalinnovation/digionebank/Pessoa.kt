package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Ricardo"

    var cpf: String = "123.456.789-00"
        private set


}
fun main(){
    val Ricardo = Pessoa()
    println(Ricardo)
    println(Ricardo.nome)
    println(Ricardo.cpf)

}