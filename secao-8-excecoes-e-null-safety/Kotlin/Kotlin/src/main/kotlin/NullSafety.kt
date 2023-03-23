fun main() {
//Null safety é um recurso de segurança de tipos na linguagem de programação Kotlin que ajuda a
// prevenir erros de tempo de execução relacionados a referências nulas (null).

    var s: String? = null

    println(s?.length)  //utilizando o ? trata caso haja uma excessao
    println(s!!.length)  // utilizamos o !! quando se tem a certeza que a variável assume um valor que não é nulo, se for nulo assume o erro
}