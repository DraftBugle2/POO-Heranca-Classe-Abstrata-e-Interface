// Onibus.java
public class Onibus extends Veiculo {
    private static final double TAXA_IPVA = 0.02;

    public Onibus(String placa, String marca, String modelo, int anoFabricacao) {
        super(placa, marca, modelo, anoFabricacao);
    }

    @Override
    public double calcularIPVA() {
        int anosUso = 2024 - getAnoFabricacao();
        double valorEstimado = 80000 - (anosUso * 3000);
        return valorEstimado * TAXA_IPVA;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Ônibus - Placa: " + getPlaca() + ", Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Ano: " + getAnoFabricacao());
    }
}
