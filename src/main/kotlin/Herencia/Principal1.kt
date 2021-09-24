package Herencia

fun main(){
    val persona1 = Persona("Jesus", "Paz", "Cale 123","123456", "25/01/1990")

    println("Persona ${persona1.nombre} fecha ${persona1.fechaNacimeinto} edad ${persona1.obtenerEdad()}")

    println(persona1.toString())

    val emp = Empleado("Jesus", "Paz", "Cale 123","123456", "25/01/1990", 5000.0)
    println("Empleado $emp")
}