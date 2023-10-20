package N1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculadoraIMCTest {

    private static CalculadoraIMC calculadora;

    @BeforeAll
    public static void setUp() {
        calculadora = new CalculadoraIMC();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dadosIMC.csv", numLinesToSkip = 1)
    public void testCalculoIMC(double peso, double altura, double resultadoEsperado) {
        double resultado = calculadora.calcularIMC(peso, altura);
        assertEquals(resultadoEsperado, resultado, 0.01); // Comparação
    }

    @ParameterizedTest
    @CsvSource({ "0, 1.75", "70, 0" }) // Testando dados errados
    public void testCalculoIMCComDadosInvalidos(double peso, double altura) {
        assertThrows(IllegalArgumentException.class, () -> calculadora.calcularIMC(peso, altura));
    }
}
