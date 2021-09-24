package `for`

fun main () {
    for (ch in "abc") {
        print(ch + 1)
    }
    println()
    for (ch in "abc") {
        print(ch)
    }
    println()
    for (ch in "abc") {
        print(ch + 1)
    }
    println()
    for (c in '0' until '9') { print(c) }
    println()
    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java", "Scala"))
}