package mockito;

/**
 * Implementation of ServicoMatematico interface
 */
public class ServicoMatematicoImpl implements ServicoMatematico {

    /**
     * Returns the sum of two integers
     * @param a first integer
     * @param b second integer
     * @return the sum of a and b
     */
    @Override
    public int somar(int a, int b) {
        return a + b;
    }
}
