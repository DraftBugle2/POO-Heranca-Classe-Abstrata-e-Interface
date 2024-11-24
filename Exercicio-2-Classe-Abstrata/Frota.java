// Frota.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Frota {
    public static void main(String[] args) {
        List<Veiculo> frota = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar veículo");
            System.out.println("2. Exibir detalhes dos veículos");
            System.out.println("3. Calcular IPVA dos veículos");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.println("Escolha o tipo de veículo (1 - Carro, 2 - Caminhão, 3 - Ônibus):");
                    int tipoVeiculo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite a placa do veículo:");
                    String placa = scanner.nextLine();
                    System.out.println("Digite a marca do veículo:");
                    String marca = scanner.nextLine();
                    System.out.println("Digite o modelo do veículo:");
                    String modelo = scanner.nextLine();
                    System.out.println("Digite o ano de fabricação do veículo:");
                    int anoFabricacao = scanner.nextInt();

                    switch (tipoVeiculo) {
                        case 1:
                            frota.add(new Carro(placa, marca, modelo, anoFabricacao));
                            System.out.println("Carro adicionado com sucesso.");
                            break;
                        case 2:
                            frota.add(new Caminhao(placa, marca, modelo, anoFabricacao));
                            System.out.println("Caminhão adicionado com sucesso.");
                            break;
                        case 3:
                            frota.add(new Onibus(placa, marca, modelo, anoFabricacao));
                            System.out.println("Ônibus adicionado com sucesso.");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\nDetalhes dos veículos da frota:");
                    for (Veiculo veiculo : frota) {
                        veiculo.exibirDetalhes();
                    }
                    break;
                case 3:
                    System.out.println("\nCálculo do IPVA dos veículos da frota:");
                    for (Veiculo veiculo : frota) {
                        double ipva = veiculo.calcularIPVA();
                        System.out.println("IPVA do veículo com placa " + veiculo.getPlaca() + ": R$" + ipva);
                    }
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();
    }
}
