import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu(scanner);
    }

    public static void menu (Scanner scanner) {
        int opc;
        do {
            System.out.println("╔═══════════════════════════════════════════╗");
            System.out.println("║             ESCOLHA UMA OPÇÃO             ║");
            System.out.println("╠═══════════════════════════════════════════╣");
            System.out.println("║  1. Soma                                  ║");
            System.out.println("║  2. Subtração                             ║");
            System.out.println("║  3. Divisão                               ║");
            System.out.println("║  4. Multiplicação                         ║");
            System.out.println("║  5. SAIR                                  ║");
            System.out.println("╚═══════════════════════════════════════════╝");
            opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    Soma.fazSoma(scanner);
                    break;

                case 2:
                    Subtracao.fazSubtracao(scanner);
                    break;

                case 3:
                    Divisao.fazDivisao(scanner);
                    break;

                case 4:
                    Multipla.fazMultipla(scanner);
                    break;

                case 5:
                    System.out.println("Saindo...");
            }

        } while (opc != 5);
    }
 }
