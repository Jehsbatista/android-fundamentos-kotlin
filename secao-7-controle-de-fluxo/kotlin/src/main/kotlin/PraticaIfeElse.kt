fun main() {
    println(calcula("gerente"))
    println(calcula2("gerente", 2))
}

//Calcule o bônus que os funcionários receberão. Gerente 2.000, coordenador 1.500, engenheiro 1.000 e estagiário 500
fun calcula(cargo: String): Float {

    if (cargo == "gerente") {
        return 2.000f
    } else if (cargo == "coordenador") {
        return 1.500f
    } else if (cargo == "engenheiro") {
        return 1.000f
    } else if (cargo == "estagiário") {
        return 500f
    } else {
        println("cargo inválido")
        return 0f
    }
}


// Modifique o primeiro exercício de acordo com o tempo de experiência
fun calcula2(cargo2: String, experiencia: Int): Float {
    var bonus = 0f
    if (cargo2 == "gerente") {
        if (experiencia < 2) {
            bonus = 2.000f
        } else {
            bonus = 3.000f
        }
    } else if (cargo2 == "coordenador") {
        if (experiencia < 1) {
            bonus = 1.500f
        } else {
            bonus = 1.800f
        }
    } else if (cargo2 == "engenheiro de software") {
        bonus = 1.000f
    } else if (cargo2 == "estagiário") {
        bonus = 500f

    }
    return bonus
}




