// QuartoDuplo.java
class QuartoDuplo implements Acomodacao, ServicoAdicional {
    private static final double DIARIA = 180.0;
    private static final double CAFE_DA_MANHA = 20.0;
    private static final double LIMPEZA_EXTRA = 30.0;

    @Override
    public double calcularDiaria(int dias) {
        return DIARIA * dias;
    }

    @Override
    public double calcularServico(int dias, int numeroPessoas) {
        return (CAFE_DA_MANHA * numeroPessoas * dias) + (LIMPEZA_EXTRA * dias);
    }

    @Override
    public void exibirDetalhes(int dias, int numeroPessoas) {
        double custoTotal = calcularDiaria(dias) + calcularServico(dias, numeroPessoas);
        System.out.println("Quarto Duplo:");
        System.out.println("  Diária: R$" + DIARIA);
        System.out.println("  Dias: " + dias);
        System.out.println("  Pessoas: " + numeroPessoas);
        System.out.println("  Custo Total: R$" + custoTotal);
    }
}