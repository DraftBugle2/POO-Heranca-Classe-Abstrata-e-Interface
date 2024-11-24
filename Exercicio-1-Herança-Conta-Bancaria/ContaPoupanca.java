// ContaPoupanca.java
public class ContaPoupanca extends ContaBancaria {
    private int diaDeRendimento;

    public ContaPoupanca(Cliente cliente, String numeroConta, int diaDeRendimento) {
        super(cliente, numeroConta);
        this.diaDeRendimento = diaDeRendimento;
    }

    public void calcularNovoSaldo(double taxaRendimento) {
        saldo += saldo * taxaRendimento;
    }
}
