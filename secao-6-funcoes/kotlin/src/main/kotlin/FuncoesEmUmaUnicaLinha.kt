fun main() {
    println("A o resultado da soma é ${soma2(20, 15)}")
    helloWorld2()
}

//Para simplificar em uma única linha a função deverá ter apenas uma instrução.

fun soma2(a: Int, b: Int) = (a + b)             //simplificando a função soma em uma única linha retirando as chaves e o return, atribuindo o sinal de =
fun helloWorld2() = println("Hello, World!!")   //simplificando a função helloWorld2 em uma única linha retirando as chaves e atribuindo o sinal de =
