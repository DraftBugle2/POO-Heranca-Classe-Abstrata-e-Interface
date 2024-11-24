// Contas.java
import java.util.Scanner;

public class Contas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Incluir dados relativos a(s) conta(s) de um cliente
        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();
        System.out.println("Digite o CPF do cliente:");
        String cpf = scanner.nextLine();
        Cliente cliente = new Cliente(nome, cpf);

        System.out.println("Digite o número da conta poupança:");
        String numeroContaPoupanca = scanner.nextLine();
        ContaPoupanca poupanca = new ContaPoupanca(cliente, numeroContaPoupanca, 15);

        System.out.println("Digite o número da conta especial:");
        String numeroContaEspecial = scanner.nextLine();
        ContaEspecial especial = new ContaEspecial(cliente, numeroContaEspecial, 500.0);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Sacar de uma conta");
            System.out.println("2. Depositar em uma conta");
            System.out.println("3. Mostrar novo saldo da poupança (com rendimento)");
            System.out.println("4. Mostrar dados da(s) conta(s) do cliente");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    // 2. Sacar um determinado valor da(s) conta(s)
                    System.out.println("Escolha a conta para sacar (1 - Poupança, 2 - Especial):");
                    int tipoContaSaque = scanner.nextInt();
                    System.out.println("Digite o valor a sacar:");
                    double valorSaque = scanner.nextDouble();

                    if (tipoContaSaque == 1) {
                        poupanca.sacar(valorSaque);
                        System.out.println("Saque realizado com sucesso na conta poupança.");
                    } else if (tipoContaSaque == 2) {
                        especial.sacar(valorSaque);
                        System.out.println("Saque realizado com sucesso na conta especial.");
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 2:
                    // 3. Depositar um determinado valor na(s) conta(s)
                    System.out.println("Escolha a conta para depositar (1 - Poupança, 2 - Especial):");
                    int tipoContaDeposito = scanner.nextInt();
                    System.out.println("Digite o valor a depositar:");
                    double valorDeposito = scanner.nextDouble();

                    if (tipoContaDeposito == 1) {
                        poupanca.depositar(valorDeposito);
                        System.out.println("Depósito realizado com sucesso na conta poupança.");
                    } else if (tipoContaDeposito == 2) {
                        especial.depositar(valorDeposito);
                        System.out.println("Depósito realizado com sucesso na conta especial.");
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 3:
                    // 4. Mostrar o novo saldo do cliente, a partir da taxa de rendimento, daqueles que possuem conta poupança
                    System.out.println("Digite a taxa de rendimento (em decimal, ex: 0.01 para 1%):");
                    double taxaRendimento = scanner.nextDouble();
                    poupanca.calcularNovoSaldo(taxaRendimento);
                    System.out.println("Novo saldo da poupança calculado com sucesso.");
                    System.out.println("Novo saldo da poupança: R$" + poupanca.getSaldo());
                    break;

                case 4:
                    // 5. Mostrar os dados da(s) conta(s) de um cliente
                    System.out.println("Dados da Conta Poupança:");
                    System.out.println("Cliente: " + poupanca.getCliente().getNome());
                    System.out.println("Número da Conta: " + poupanca.getNumeroConta());
                    System.out.println("Saldo: R$" + poupanca.getSaldo());

                    System.out.println("\nDados da Conta Especial:");
                    System.out.println("Cliente: " + especial.getCliente().getNome());
                    System.out.println("Número da Conta: " + especial.getNumeroConta());
                    System.out.println("Saldo: R$" + especial.getSaldo());
                    break;

                case 5:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();

        // Mostrar o saldo final de cada conta
        System.out.println("\nSaldo final da Conta Poupança: R$" + poupanca.getSaldo());

    }
}
