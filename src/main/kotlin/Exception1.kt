import java.lang.Exception

fun main(){
    print("es numero : ")
    println(esNumero(readLine()!!))

}



fun uno(){
       try {
       print("Ingrese valor: ")
       var valor = readLine()!!.toDouble()
       println("valor: $valor")
   }
   catch (e: Exception){
       println("Error ${e.message}")

   }
}

fun dos(valor: Double): Double{
    if (valor > 10){
        throw Exception("el valor no puede ser mayor a 10")
    }

    return valor*10;
}

fun  esNumero(numero: Any): Boolean{

    val resul = try {
        readLine().toString().toDouble()
        true
    }
    catch (e: Exception){
        false
    }
    return resul
}