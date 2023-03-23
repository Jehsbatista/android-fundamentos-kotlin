import java.lang.ArithmeticException

fun main() {

    try {
        val s: String? = null                      //código que pode resultar um erro
        println(s!!.length)
        val a = 10 / 0
    } catch (e: NullPointerException) {
        println("variável nula")                  //tratando o erro, capturando excecoes do tipo nullpointer
    } catch (e: ArithmeticException) {            //podem existir mais tratamentos
        println("Não pode ser dividido por 0")
    } catch (e: Exception) {
        println("tipo genérico")                   //só cai nesse bloco caso não cair em nenhum tipo específico antes
    }
}