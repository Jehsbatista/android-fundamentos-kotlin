
fun main() {
//Map - coleção do tipo chave e valor, para cada chave existe um valor associado

    var map1 = mapOf<String, Int>(Pair("Jéssica", 31))
    var map2 = mutableMapOf<String, Int>(Pair("Carlos", 53))

    println(map1.entries)
    println(map1.values)

    map2["João"] = 60
    map2.replace("Carlos", 32)
    println(map2)
}