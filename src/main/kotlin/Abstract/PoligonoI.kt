package Abstract

interface PoligonoI {

    fun obtenerArea(): Double
    fun obtenerPerimetro(): Double


    fun centrimetrosAPulgadas(valor: Double): Double{
        return (1/2.54) * valor
    }
}

interface Graficos {
    fun dibujar()
}