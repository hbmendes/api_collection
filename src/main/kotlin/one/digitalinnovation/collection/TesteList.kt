package one.digitalinnovation.collection

data class Funcionario(
    var nome:String,
    var salario:Double,
    var tipoContrato:String){
    override fun toString(): String = """
            Nome:           $nome
            Salario:        $salario
            Tipo Contrato:  $tipoContrato
        """.trimIndent()
    }

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach { println("${it} \n") }

    println("############################################")
    println("###PROCURA MARIA E RETORNA AS INFORMAÇÕES###")
    println(funcionarios.find { it.nome == "Maria" })

    println("#########################")
    println("###ORDENAR POR SALARIO###")

    funcionarios
        .sortedBy { it.salario }
        .forEach { println("${it} \n") }

    println("##############")
    println("###SEPARA EM GRUPOS TIPO DE CONTRATO###")

    funcionarios
        .groupBy { it.tipoContrato }
        .forEach { println("${it} \n") }
}