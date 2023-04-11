import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.fail

class MainTest {

    @DisplayName("Teste metodo xxoo")
    @Test
    fun testCountXO() {
        Assertions.assertAll(
            //utilizando o assertAll executa todos os métodos de teste, independente se um falha ou não
            { Assertions.assertTrue(countXO("xxoo")) },
            { Assertions.assertTrue(countXO("xxoo")) },

            )
        Assertions.assertTrue(countXO("xxoo"))
        Assertions.assertTrue(countXO("xxoo"))  //dessa maneira se um metodo verificado falhar, todos iram falhar também

    }

    //utilizando o disabled em um método ainda não implementado. Quando rodar os testes ele será indiferente
    @Test
    @Disabled
    fun naoImplementado() {

    }
    @Test
    fun vaiFalhar() {
        fail("Não posso terminar os testes sem esse método")
    }
}