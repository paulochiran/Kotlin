package Abstract

fun main() {
    var rectangulo = Rectangulo("Rect 1", 10.0, 5.0)

    println(rectangulo.obtenerArea())
    println(rectangulo.obtenerAreaPulgadas())
    rectangulo.dibujar()
    println(rectangulo.identificador)

    var rectangulo1 = RectanguloI("Rect 1", 10.0, 5.0)

    println(rectangulo1.obtenerArea())
    println(rectangulo1.obtenerAreaPulgadas())
    rectangulo1.dibujar()
}