package one.digitalinnovation.collection

fun main(){
    val salarios = doubleArrayOf(1000.0, 5000.2, 2250.0)

    for (salario in salarios){
        println(salario)
    }

    println("#####################")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salario: ${salarios.average()}")

    println("###FILTRAR VALOR MAIOR QUE 2500####")
    salarios.sort()
    val salarioMaiorQue2500 = salarios.filter { it > 2500.0 }
    salarioMaiorQue2500.forEach{ println(it)}


    println("###QUANTIDADES ENTRE 2000.0 ~ 9000.0###")
    println(salarios.count { it in 2000.0..9000.0 })


    println("###FAZ A BUSCA DAS CONDICOES E RETORNA NULL CASO SEJA FALSE###")
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 500.0 })


    println("###FAZ A BUSCA DAS CONDICOES E RETORNA FALSE OU TRUE###")
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 500.0 })
}