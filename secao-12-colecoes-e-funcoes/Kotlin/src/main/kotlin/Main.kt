
fun main() {
//Set - coleção de elementos não ordenada, não permite valores duplicados

    val set1: Set<String> = setOf<String>("São Paulo", "Rio de Jandeiro", "Minas Gerais", "Minas Gerais")
    val set2: MutableSet<String> = mutableSetOf()

    println(set1)

    set2.addAll(mutableListOf("Jorge", "João", "Carlos"))
    set2.remove("Jorge")
    println(set2.contains("Roberto"))
    println(set2)

}