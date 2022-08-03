package one.digitalinnovation.digionebank.Testes

import one.digitalinnovation.digionebank.Analista



fun main(){
    val Maria = Analista("Maria Jose" ,"123.456.789-00" , salario = (5000.00))

    ImprimeRelatorioFuncionario.imprime(Maria)
}

