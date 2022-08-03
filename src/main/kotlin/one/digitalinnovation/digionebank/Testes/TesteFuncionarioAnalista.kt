package one.digitalinnovation.digionebank.Testes

import one.digitalinnovation.digionebank.Analista


fun main(){
    val Joao = Analista("Joao Pedro" ,"123.456.789-00" , salario = (2000.00))

   ImprimeRelatorioFuncionario.imprime(Joao)
}
