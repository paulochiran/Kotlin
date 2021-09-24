package ParallelS

fun main(args: Array<String>) {
    var people = arrayListOf<Person>()
    var p1 = Person("Paulo", 35)
    people.add(p1)
    var p2 = Person("Maria", 30)
    people.add(p2)
    var p3 = Person("Ana", 15)
    people.add(p2)

    var p =people.stream().filter { it.age > 18 }
    for(a in p){
        println("nombre: ${a.name} Edad: ${a.age}")
    }

    val numbers = listOf("one", "two", "three", "four")
    val longerThan3 = numbers.filter { it.length > 3 }
    println(longerThan3)

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    val filteredMap = numbersMap.filter { (key, value) -> key.endsWith("1") && value > 10}
    println(filteredMap)

    //--------------------
    val numbers1 = listOf("one", "two", "three", "four")
    val (match, rest) = numbers1.partition { it.length > 3 }

    println(match)
    println(rest)
}

class Person(var name: String, var age : Int){}
