//Exemplo utilizando o Operador (range) é utilizado para avaliar intervalos entre valores.
//verificando se o número está dentro de 1 a 50, utilizando a palavra reservada in e ..
fun main() {
    val n = 24
    if (n in 1..50) {
        println("está correto")
    } else {
        println("não está correto")
    }
}

/*   Operadores para serem utilizados em controle de fluxo
     MAIOR  >
     MENOR  <
     MENOR IGUAL  <=
     MAIOR IGUAL  >=
     IGUAL  ==
     DIFERENTE  !=
     NEGAÇÃO  !


     Operadores lógicos, avalia relação entre valores
     CONJUNÇÃO  &&   -- só é executado caso todos os valores forem verdadeiro
     DISJUNÇÃO  ||   -- basta que um deles seja verdadeiro para que a condição seja executada
 */