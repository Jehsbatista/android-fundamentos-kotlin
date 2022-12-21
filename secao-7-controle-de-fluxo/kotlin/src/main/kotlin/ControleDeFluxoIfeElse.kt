fun main() {

    verifica(17)
}

fun verifica(idade: Int) {
    if (idade > 18) {
        println("maior de idade")
    } else {
        println("criança")
    }
}