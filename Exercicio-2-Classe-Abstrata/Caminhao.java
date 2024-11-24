// Caminhao.java
public class Caminhao extends Veiculo {
    private static final double TAXA_IPVA = 0.015;

    public Caminhao(String placa, String marca, String modelo, int anoFabricacao) {
        super(placa, marca, modelo, anoFabricacao);
    }

    @Override
    public double calcularIPVA() {
        int anosUso = 2024 - getAnoFabricacao();
        double valorEstimado = 100000 - (anosUso * 5000);
        return valorEstimado * TAXA_IPVA;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Caminhão - Placa: " + getPlaca() + ", Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Ano: " + getAnoFabricacao());
    }
}