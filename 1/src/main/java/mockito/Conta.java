package mockito;

/**
 * Account class representing a bank account
 */
public class Conta {
    private String numero;
    private double saldo;

    /**
     * Constructor with account number and balance
     * @param numero account number
     * @param saldo account balance
     */
    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    /**
     * Gets the account number
     * @return account number
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Sets the account number
     * @param numero account number
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Gets the account balance
     * @return account balance
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Sets the account balance
     * @param saldo account balance
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
