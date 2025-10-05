package mockito;

/**
 * Repository interface for account operations
 */
public interface ContaRepository {

    /**
     * Finds an account by its number
     * @param numero account number
     * @return the account if found
     */
    Conta buscarConta(String numero);

    /**
     * Saves an account
     * @param conta account to save
     */
    void salvar(Conta conta);
}
