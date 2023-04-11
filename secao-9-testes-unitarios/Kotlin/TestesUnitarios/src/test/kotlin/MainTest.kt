import org.junit.jupiter.api.*
import kotlin.test.fail

class MainTest {

    @DisplayName("Teste metodo xxoo")
    @Test
    fun testCountXO(s: String) {
        Assertions.assertAll(
            //utilizando o assertAll executa todos os métodos de teste, independente se um falha ou não
            { Assertions.assertTrue(countXO("xxoo")) },
            { Assertions.assertTrue(countXO("xxoo")) },

            )
        Assertions.assertTrue(countXO("xxoo"))
        Assertions.assertTrue(countXO("xxoo"))  //dessa maneira se um metodo verificado falhar, todos iram falhar também

    }

    @Test
    @Disabled
    fun naoImplementado() {

    }

    @Test
    fun vaiFalhar() {
        fail("Não posso terminar os testes sem esse método")
    }

    @Test
    fun assumpition() {
        Assumptions.assumeTrue(countXO("xxoo"))
        Assertions.assertTrue(abc())
    }

    @Test
    fun exception(){
     assertThrows<NullPointerException> {abcd()  }
    }
}