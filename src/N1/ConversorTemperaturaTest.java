package N1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ConversorTemperaturaTest {

    @Test
    public void testCelsiusParaFahrenheit() {
        double resultado = ConversorTemperatura.celsiusParaFahrenheit(0.0);
        assertEquals(32.0, resultado, 0.01); // Testando de 0°c para 32°F 
    }

    @Test
    public void testFahrenheitParaCelsius() {
        double resultado = ConversorTemperatura.fahrenheitParaCelsius(32.0);
        assertEquals(0.0, resultado, 0.01); // Testando de 32°f para a 0°c
    }
}
