fun main(){
    uno1()
    println("---")
    calculo()
    println("---")
    calculo2()
    println("---")
    dos()
}

fun dos(){
    print("Ingrese valor: ")
    var entrada= readLine()
    val lado = entrada?.toDoubleOrNull()
   //lambda se ejecuta si lado no es null
    lado?.let {
        val resultado = it * it
        println(resultado)
    }
    println("finaliza ")
}
fun uno1(){
    // null safety
    var texto: String ? = null
    var numero: Int? = null
    numero =10
    val resultado = numero!! * numero
    println("valor: $resultado")
}
/**
 * No Acepta caracteres
 */
fun calculo(){
    print("Escriba un valor: ")
    var entrada = readLine()
    var lado = entrada?.toDouble() ?: 0.0

    var resultado = lado*lado
    println("resultado: $resultado")
}

/**
 * Acepta caracteres
 */
fun calculo2(){
    print("Escriba un valor: ")
    var entrada = readLine()
    var lado = entrada?.toDoubleOrNull() ?: 0.0

    var resultado = lado*lado
    println("resultado: $resultado")
}