package Abstract

abstract class Poligono(val identificador : String) {

    abstract fun obtenerArea(): Double
    abstract  fun obtenerPerimetro(): Double
    abstract  fun dibujar()

    protected fun centrimetrosAPulgadas(valor: Double): Double{
        return (1/2.54) * valor
    }
}