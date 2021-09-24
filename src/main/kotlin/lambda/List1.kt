package lambda

fun main(){
    val heroes = listOf(
    Hero("The Captain", 60, Gender.MALE),
    Hero("Frenchy", 42, Gender.MALE),
    Hero("The Kid", 9, null),
    Hero("Lady Lauren", 29, Gender.FEMALE),
    Hero("First Mate", 29, Gender.MALE),
    Hero("Sir Stephen", 37, Gender.MALE))

    println( heroes.last().name)

    var name = heroes.firstOrNull { it.age == 30 }?.name
    println(name)

    name = heroes.firstOrNull { it.age == 29 }?.name
    println(name)

    var size = heroes.map { it.age }.distinct().size
    println(size)

    var filter1 = heroes.filter { it.age < 30 }.size
    println(filter1)

    val (youngest, oldest) = heroes.partition { it.age < 30 }
    println("oldest ${oldest.size}")
    println("oldest ${oldest.toString()}")
    println("yougest ${youngest.size}")
    println("yougest ${youngest.toString()}")

    var max1= heroes.maxByOrNull { it.age }?.name
    println(max1)

    var list1 = heroes.all { it.age < 50 }
    println(list1)

    var any1 = heroes.any { it.gender == Gender.FEMALE }
    println(any1)
}

data class Hero(var name:String, var age: Int, var gender:Gender?)

enum class Gender(){
   MALE,FEMALE
}