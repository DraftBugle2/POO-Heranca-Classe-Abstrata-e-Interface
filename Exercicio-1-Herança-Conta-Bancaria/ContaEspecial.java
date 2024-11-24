// ContaEspecial.java
public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(Cliente cliente, String numeroConta, double limite) {
        super(cliente, numeroConta);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo + limite) {
            System.out.println("Saldo insuficiente, mesmo considerando o limite!");
        } else {
            saldo -= valor;
        }
    }
}