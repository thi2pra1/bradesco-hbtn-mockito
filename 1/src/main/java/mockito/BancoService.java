package mockito;

/**
 * Banking service that depends on ContaRepository
 */
public class BancoService {
    private ContaRepository contaRepository;

    /**
     * Constructor with dependency injection
     * @param contaRepository the account repository dependency
     */
    public BancoService(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    /**
     * Consults the balance of an account
     * @param numeroConta account number
     * @return account balance
     */
    public double consultarSaldo(String numeroConta) {
        Conta conta = contaRepository.buscarConta(numeroConta);
        return conta != null ? conta.getSaldo() : 0.0;
    }

    /**
     * Deposits money into an account
     * @param numeroConta account number
     * @param valor amount to deposit
     */
    public void depositar(String numeroConta, double valor) {
        Conta conta = contaRepository.buscarConta(numeroConta);
        if (conta != null) {
            conta.setSaldo(conta.getSaldo() + valor);
            contaRepository.salvar(conta);
        }
    }
}
