package mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Unit test class for Calculadora using Mockito
 */
@ExtendWith(MockitoExtension.class)
public class CalculadoraTest {

    @Mock
    private ServicoMatematico servicoMatematico;

    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora(servicoMatematico);
    }

    @Test
    public void testCalcularSoma() {
        // Arrange - Configure the mock to return 5 when somar is called with arguments 2 and 3
        when(servicoMatematico.somar(2, 3)).thenReturn(5);

        // Act - Call the method under test
        int resultado = calculadora.calcularSoma(2, 3);

        // Assert - Verify that the result equals 5, as configured in the mock
        assertEquals(5, resultado);
    }
}
