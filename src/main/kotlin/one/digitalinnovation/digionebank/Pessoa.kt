package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Renato"
    var cpf: String = "111.111.111-11"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main(){
    val renato = Pessoa()
    println(renato.pessoaInfo())
}