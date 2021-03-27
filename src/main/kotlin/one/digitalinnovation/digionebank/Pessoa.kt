package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Renato"
    var cpf: String = "111.111.111-11"
    private set
}

fun main(){
    val renato = Pessoa()

    println(renato)
    println(renato.nome)
    println(renato.cpf)

}