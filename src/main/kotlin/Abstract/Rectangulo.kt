package Abstract

import kotlin.math.roundToInt

class Rectangulo (identificador: String, var base: Double, var altura: Double) : Poligono(identificador) {

    override fun obtenerArea(): Double {
       return base * altura
    }

    override fun obtenerPerimetro(): Double {
       return (2*base)+ (2*altura)
    }

    override fun dibujar() {
        for (i in 1..altura.roundToInt() ){
            println(" * ".repeat(base.toInt()))
        }
    }

    fun obtenerAreaPulgadas(): Double{
        return centrimetrosAPulgadas(obtenerArea())
    }

    fun obtenerPerimetroPulgadas(): Double{
        return centrimetrosAPulgadas(obtenerPerimetro())
    }


}