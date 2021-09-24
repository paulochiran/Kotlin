package DataClass

fun main(){
    var personaA = PersonaA("ana", "123")
    var personaB = PersonaB("Ana", "123")

    var personaC = personaB.copy()
    personaC.nombre = "Juan"

    var (nombre, telefono) = personaB

    println(personaA)
    println(personaB)
    println(personaC)
    println("$nombre $telefono")
    println("tamaño ${personaB.obtenerLargoNombre()}")
    println(Estado.EN_PROCESO)
}

class PersonaA(var nombre: String, var telefono: String)

data class PersonaB(var nombre: String, var telefono: String){
    fun obtenerLargoNombre(): Int {
        return nombre.length
    }
}

enum class Estado{
    PENDIENTE{
        override fun toString(): String {
            return "La tarea no se ha realizao"
        }
             },
    EN_PROCESO,
    REALIZADA
}