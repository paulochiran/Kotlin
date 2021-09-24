
fun main(){
    calcular(1)
    calcular(2)
    calcular(5)
    println("2--------------------")
    calcular2("gasolina")
    calcular2("electrico")
    println("3--------------------")
    calcular3(2)
    calcular3(11)
    calcular3(25)
    calcular3(100)
    println("4--------------------")
    println(calcular4(2))
    println(calcular4(11))
    println(calcular4(25))
    println(calcular4(100))
    println("5--------------------")
    calcular5(2)
    calcular5("11")
    calcular5(25.00)
    calcular5(100L)
}

fun calcular(condicion: Int){
    when (condicion){
        1 -> println("es uno")
        2 -> println("es dos")
        3 -> println("es tres")
        else -> {
            println("no es ninguno")
            println("fin")
        }
    }
}

fun calcular2(condicion: String){
    when(condicion){
        "gasolina","diesel" -> println("es gasolina o diesel")
        "peptroleo" -> println("es petroleo")
        else -> println("no es ninguna")
    }
}

fun calcular3(x: Int){
    var validNumbers = listOf(11,12)
    when (x) {
        in 1..10 -> println("el numero está entre 1 y 10")
        in validNumbers -> println("el número es 11 o 12")
        !in 21..30 -> println("el número esta entre 21 y 30")
        else -> println("el número está fuera del rango")
    }
}

fun calcular4(x: Int): String{
    var validNumbers = listOf(11,12)
    var resultado = when (x) {
        in 1..10 -> "el numero está entre 1 y 10"
        in validNumbers -> "el número es 11 o 12"
        !in 21..30 -> "el número esta entre 21 y 30"
        else -> "el número está fuera del rango"
    }
    return resultado
}

fun calcular5(x: Any){

    when (x) {
        is String -> println("es string")
        is Int -> println("is int")
        is Long -> println("is long")
        else -> println("is notting")
    }
}