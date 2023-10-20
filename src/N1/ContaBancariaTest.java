package N1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContaBancariaTest {

    private ContaBancaria conta;

    @BeforeEach
    public void setUp() {
        // Configurando a conta e colocando saldo
        conta = new ContaBancaria(1, 0.0); 
    }

    @Test
    public void testDepositar() {
        conta.depositar(500.0);
        assertEquals(500.0, conta.getSaldo(), 0.01); // Fazendo deposito
    }

    @Test
    public void testSacarComSaldoSuficiente() {
        conta.depositar(1000.0); //Depositando mais dinheiro
        boolean resultado = conta.sacar(500.0);
        assertTrue(resultado); 
        assertEquals(500.0, conta.getSaldo(), 0.01); 
    }

    @Test
    public void testSacarComSaldoInsuficiente() {
        boolean resultado = conta.sacar(1500.0);
        assertFalse(resultado); // Retornar false pois o saldo é insuficiente
        assertEquals(0.0, conta.getSaldo(), 0.01);
    }
}
