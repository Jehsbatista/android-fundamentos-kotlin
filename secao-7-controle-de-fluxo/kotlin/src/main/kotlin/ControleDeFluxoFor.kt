fun main() {

    //Com o For é possível percorrer uma lista de elementos, no exemplo de 1 a 10
    for (i in 1..10) {
        println(i)
    }

    //utilizando o step percorre a lista de 2 em 2
    for (j in 1..20 step 2) {
        println(j)
    }

    // utilizando o downTo percorre na ordem descrecente
    for (k in 20 downTo 0) {
        println(k)
    }

    val str = "Kotlin"
    for (char in str) {
        println(char)
    }
}