package Herencia

class Empleado (
    nombre: String,
    apellido: String,
    direccion: String,
    telefono: String?,
    fechaNacimientoTexto: String,
    var salario: Double
        ) : Persona(nombre, apellido, direccion, telefono, fechaNacimientoTexto) {

    override fun toString(): String {
        return super.toString() + " Salario $salario"
    }
}