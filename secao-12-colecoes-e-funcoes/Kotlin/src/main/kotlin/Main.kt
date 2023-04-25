//collections - conjunto de elementos - List, Set e Map

fun main() {
    //List
    val lista1: List<Int> = listOf(1, 2, 3, 4, 5, 6)


    //mutableList
    var lista2: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6)

    println(lista2[2])
    println(lista2.size)
    lista2.add(8)
    lista2.remove(1)
    lista2.removeAt(1)
    println(lista2.contains(5))
    println(lista2)
}