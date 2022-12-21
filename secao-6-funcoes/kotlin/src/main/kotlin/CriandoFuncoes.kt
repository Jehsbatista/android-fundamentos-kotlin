fun main() {
    println("A o resultado da soma é ${soma(20, 15)}")     //chamando a função soma utilizando interpolação e imprimindo o resultado.
    helloWorld()                                                 //chamando a função hello.
}


//Exemplos de funções com e sem retorno

fun soma(a: Int, b: Int): Int {     //Função soma com um parâmetro 'a' do tipo Int e um parâmetro 'b' do tipo Int, com um tipo de retorno Int.
    return (a + b)                  //corpo da função retornando a soma dos parâmetros passados acima a + b. Toda vez que tiver um tipo de retorno é obrigatório utilizar a palavra reservada 'return'
}

fun helloWorld(){                   //Função hello sem parâmetros e sem tipo de retorno.
    println("Hello, World!!")
}