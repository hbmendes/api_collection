package one.digitalinnovation.collection

data class Funcionario(
    var nome:String,
    var salario:Double,
    var descricao:String){
    override fun toString(): String = """
            Nome:       $nome
            Salario:    $salario
            Descricao:  $descricao
        """.trimIndent()
    }

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach { println("${it} \n") }

    println("##############")
    println(funcionarios.find { it.nome == "Maria" })

    println("##############")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println("${it} \n") }

    println("##############")
    funcionarios
        .groupBy { it.descricao }
        .forEach { println("${it} \n") }
}