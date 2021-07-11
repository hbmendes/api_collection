package one.digitalinnovation.collection

fun main(){
    val values = intArrayOf( 11, 82, 13, 41, 25, 62, 74, 38, 59)

    values.forEach {
        println(it)
    }

    println("#####################")
    values.sort()
    values.forEach {
        println(it)
    }

    println("#####################")
    values.sortDescending()
    values.forEach {
        println(it)
    }
}