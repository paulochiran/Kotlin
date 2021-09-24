package Clase1

import java.util.*

const val MAXIMO = 10

fun main(){
    val nota = Notaa("Paulo", "vacio")
    println("fecha ${nota.fecha} nombre: ${nota.nombre} ")
    val nota2 = Notaa("Paulo", "vacio", Date())
    println("fecha ${nota2.fecha} nombre: ${nota2.nombre} ")

    var cont = Contador("Ana")
    println(Contador.numeroInstancias)
    var cont2 = Contador("Ana")
    println(Contador.numeroInstancias)

    println(Constantes.MAXIMO)
}