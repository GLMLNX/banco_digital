public abstract class Conta implements IConta{

    protected double saldo;
    protected int agencia;
	protected int numero;
    protected Cliente cliente;

    public Conta() {
    }

    public Conta(double saldo, int agencia, int numero, Cliente cliente) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.cliente = cliente;
    }

    @Override
    public void transferencia(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    
    public int getNumero() {
        return numero;
    }

    
    public Cliente getCliente() {
        return cliente;
    }
   
}
