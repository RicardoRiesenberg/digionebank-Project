package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Ricardo"
    var cpf: String = "123.456.789-00"
        private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"

}
fun main(){
    val Ricardo = Pessoa()
    println(Ricardo.pessoaInfo())


}