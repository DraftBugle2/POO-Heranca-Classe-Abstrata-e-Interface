// Carro.java
public class Carro extends Veiculo {
    private static final double TAXA_IPVA = 0.04;

    public Carro(String placa, String marca, String modelo, int anoFabricacao) {
        super(placa, marca, modelo, anoFabricacao);
    }

    @Override
    public double calcularIPVA() {
        int anosUso = 2024 - getAnoFabricacao();
        double valorEstimado = 50000 - (anosUso * 2000);
        return valorEstimado * TAXA_IPVA;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Carro - Placa: " + getPlaca() + ", Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Ano: " + getAnoFabricacao());
    }
}