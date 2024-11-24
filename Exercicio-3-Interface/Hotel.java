import java.util.Scanner;

// Hotel.java
public class Hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de gerenciamento do hotel!");
        System.out.println("Escolha o tipo de acomodação: 1 - Quarto Simples, 2 - Quarto Duplo, 3 - Suíte");
        int tipo = scanner.nextInt();

        System.out.println("Quantos dias deseja ficar hospedado?");
        int dias = scanner.nextInt();

        System.out.println("Quantas pessoas irão se hospedar?");
        int numeroPessoas = scanner.nextInt();

        Acomodacao acomodacao = null;

        switch (tipo) {
            case 1:
                acomodacao = new QuartoSimples();
                break;
            case 2:
                acomodacao = new QuartoDuplo();
                break;
            case 3:
                acomodacao = new Suite();
                break;
            default:
                System.out.println("Opção inválida!");
                System.exit(0);
        }

        acomodacao.exibirDetalhes(dias, numeroPessoas);
    }
}
