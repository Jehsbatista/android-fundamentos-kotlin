fun main() {
    println(valores(false))

}

fun valores(value: Any): Unit {
//Any - recebe qualquer tipo de dado (Boolean, Int, String..) comportamento igual ao <T> generics
}

fun retorno(value: Any): Unit {
// Unit - denota que uma função não tem retorno, executa o corpo e finaliza
}

fun unit(value: Any): Nothing {
//mais utilzado quando quer retornar uma excecao da função
    TODO("NÃO IMPLEMENTADO")
}