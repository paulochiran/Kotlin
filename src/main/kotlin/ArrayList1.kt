fun main(){
    listas1()
    println("2-----------------------")
    listas2()
}

fun listas1(){
    var empleados = arrayListOf("uno", "dos","tres")
    empleados.add("cuatro")
    empleados.sort()
    for (a in empleados){
        println(a)
    }
    println("---------------------")
    empleados.removeAt(1)
    for (a in empleados){
        println(a)
    }
}

fun listas2(){
    var empleados = arrayListOf("uno", "dos","tres")
    empleados.forEach{ empleado -> println(empleado) }
    println("indexed--------------------------------")
    empleados.forEachIndexed{ i, empleado -> println(" indice $i valor $empleado") }
}