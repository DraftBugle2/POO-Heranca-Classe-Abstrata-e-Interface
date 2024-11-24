// ContaBancaria.java
public class ContaBancaria {
    protected Cliente cliente;
    private String numeroConta;
    protected double saldo;

    public ContaBancaria(Cliente cliente, String numeroConta) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
