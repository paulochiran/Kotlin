package Clase1

import java.util.*

class Notaa (var nombre:String, var contenido: String, var fecha: Date) {
    init {
        nombre = nombre.uppercase()
    }

    constructor(nombre: String, contenido: String): this (nombre, contenido, Date())
}