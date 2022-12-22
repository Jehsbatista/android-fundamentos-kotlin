//Exercício de if e else utilizando o operador when

fun bonuswhen(cargo: String): Float {
    return when (cargo) {
        "gerente" -> 2.000f
        "coordenador" -> 1.500f
        "engenheiro de software" -> 1.000f
        "estagiário" -> 500f
        else -> 0f
    }
}

fun main() {
    println(bonuswhen("estagiário"))
}
