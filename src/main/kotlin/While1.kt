

fun main(){
    var nombre = " "
    var result : String=""
    while(nombre!= ""){

        print("nombre: ")
        nombre = readLine().toString()
        if(nombre!="") {
            result += nombre + ", "
        }
        println("")
    }

    println("Resultado: $result")

}