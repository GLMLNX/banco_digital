public interface IConta {
    public void transferencia(double valor,Conta contaDestino);
    public void sacar(double valor);
    public void depositar(double valor);
}
