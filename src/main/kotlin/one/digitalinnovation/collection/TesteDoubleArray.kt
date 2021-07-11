package one.digitalinnovation.collection

fun main(){
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    var MENOR_VALOR:Double = 99999999.0
    var MAIOR_VALOR:Double = 0.0

    salarios.forEach { println(it) }

    println("###FUNCAO###")
    salarios.forEachIndexed { i, x ->
        if (salarios[i] <= MENOR_VALOR){
            MENOR_VALOR = x
        }
        if (salarios[i] >= MAIOR_VALOR){
            MAIOR_VALOR = x
        }
    }
    println("###MENOR_VALOR###")
    println(MENOR_VALOR)
    println("###MAIOR_VALOR###")
    println(MAIOR_VALOR)

    println("################")
    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
    salarios2.sort()
    salarios2.forEach { println(it) }

    println("##CALCULO###")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }
}
