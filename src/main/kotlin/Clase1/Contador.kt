package Clase1

class Contador(var nombre: String) {

    init {
        numeroInstancias++
    }

    companion object{
        var numeroInstancias=0
    }
}