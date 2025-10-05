package mockito;

/**
 * Calculator class that depends on ServicoMatematico to perform operations
 */
public class Calculadora {

    private ServicoMatematico servicoMatematico;

    /**
     * Constructor with dependency injection
     * @param servicoMatematico the mathematical service dependency
     */
    public Calculadora(ServicoMatematico servicoMatematico) {
        this.servicoMatematico = servicoMatematico;
    }

    /**
     * Performs addition using the injected mathematical service
     * @param a first integer
     * @param b second integer
     * @return the result of the addition
     */
    public int calcularSoma(int a, int b) {
        return servicoMatematico.somar(a, b);
    }
}
