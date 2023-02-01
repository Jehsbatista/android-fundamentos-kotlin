fun main() {
    //quadrado()
    //triangulo()
    portaria()
}

//1 - Escreva um programa capaz de ler 2 lados inteiros que representam os lados de uma figura geométrica, informar se formar um quadrado (lados iguais).

fun quadrado() {
    println("Informe o lado 1: ")
    val lado1 = readLine()

    println("Informe o lado 2: ")
    val lado2 = readln()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()

        if (x == y) {
            println("É um quadrado.")
        } else {
            println("Não é um quadrado.")
        }
    }

}

//2 - Escreva um programa capaz de ler 3 números inteiros que representam os lados de um triângulo, informar se é triângulo equilátero (3 lados iguais.

fun triangulo() {
    println("Informe o lado 1: ")
    val lado1 = readLine()

    println("Informe o lado 2: ")
    val lado2 = readln()

    println("Informe o lado 3: ")
    val lado3 = readln()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "" && lado3 != null && lado3 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()
        val z = lado3.toInt()


        if (x == y && y == z) {
            println("É um triângulo equilátero.")
        } else {
            println("Não é um triângulo equilátero.")
        }
    }

}

//3 - Escreva um programa para ser usado na portaria de um evento.
fun portaria() {
    print("Qual sua idade?")
    val idade = readLine()

    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado. menores de idade não são permitidos")
            return
        }
    }
    print("Qual seu tipo de convite?")
    var tipoConvite = readLine()

    if (tipoConvite != null && tipoConvite != "") {
        tipoConvite = tipoConvite.lowercase()

        //validação de tipo de convite

        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            println("Negado. Convite inválido")
            return
        }

        print("Qual o código do convite?")
        var codigo = readln()

        if (codigo != null && codigo != "") {
            codigo = codigo.lowercase()

            if (tipoConvite == "comum" && codigo.startsWith("xt")) {
                println("Welcome")
            } else if (tipoConvite == "premium" || tipoConvite == "luxo" && codigo.startsWith("xl")) {
                println("welcome")

            } else {
                println("Negado. Convite inválido")
            }


        }

    }
}


