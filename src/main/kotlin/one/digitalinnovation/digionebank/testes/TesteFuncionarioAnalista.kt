package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val joao = Analista("Joao", "123456789", 2000.00)
    ImprimeRelatorioFuncionario.imprime(joao)
}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())