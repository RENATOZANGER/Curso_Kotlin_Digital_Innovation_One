package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val maria = Gerente("Maria", "123456789", 5000.00)
    ImprimeRelatorioFuncionario.imprime(maria)
}