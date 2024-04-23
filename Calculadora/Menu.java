import java.util.Scanner;
import java.io.IOException;

public class Menu {
    public static void Menu (Scanner scanner) {
        int opc;
        do {
            clearScreen();
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
                    Soma.soma;
                    break;
            }
        }
    }
 }
