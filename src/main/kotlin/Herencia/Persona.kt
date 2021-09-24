package Herencia

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

open class Persona
    ( var nombre: String,
      var apellido: String,
      var direccion: String,
      var telefono: String?,
      var fechaNacimientoTexto: String
    )
{
    var fechaNacimeinto: LocalDate = LocalDate.parse(fechaNacimientoTexto, DateTimeFormatter.ofPattern(FORMATO_FECHA))

    fun obtenerEdad(): Int{
        return Period.between(fechaNacimeinto, LocalDate.now()).years
    }

    override fun toString(): String {
       //return super.toString()
        return "Persona $nombre Apellido $apellido fecha $fechaNacimeinto edad ${obtenerEdad()}"
    }

    companion object{
        const val FORMATO_FECHA = "dd/MM/yyyy"
    }
}