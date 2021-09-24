fun main(){
    armar().forEach { println(it) }
    println("1-----------------------")
    imp()
    println("2-----------------------")
    imp2()
    println("3-----------------------")
    imp3()
}
fun armar() : Array<String>{
    var arreglo = arrayOf("uno", "dos","tres")
    return arreglo
}
fun imp(){
    var arreglo = arrayOf("uno", "dos","tres","cuatro")
    for (element in arreglo){
        println(element)
        if(element == "dos"){
            println("si entra")
            break
        }
    }
}
fun imp2(){
    var arreglo = arrayOf("uno", "dos","tres")
    for (x in 0 until arreglo.size){
        println(arreglo[x])
    }
}

fun imp3(){
    var arreglo = arrayOf("uno", "dos","tres")
    for ((i, numero) in arreglo.withIndex()){
        println("$i numero $numero")
    }
}
