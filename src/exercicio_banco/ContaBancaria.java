package exercicio_banco;

public class ContaBancaria {

    private String nomeCliente;
    private String numeroConta;
    private double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", numeroConta='" + numeroConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public boolean sacar(double valor){
        if ((saldo - valor) >= 0 ){
            saldo -= valor;
            return true;
        }
        return false;
    }
}
