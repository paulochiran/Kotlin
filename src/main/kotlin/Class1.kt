import java.util.*

class Notas {
    var nota1: String = ""
    var nota2: String = ""
    var fecha : Date = Date()
    var persona : Persona = Persona()
}

fun main(){
     val nota = Notas()
    nota.nota1 = "E"
    nota.nota2 = "A"
    nota.fecha = Date()

    nota.persona.nombre= "Paulo"

    println("Notas ${nota.nota1}")
}