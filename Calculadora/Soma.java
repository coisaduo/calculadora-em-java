import java.util.Scanner;

public class Soma {
    public static void fazSoma(Scanner scanner) {
        System.out.println("Fala feio! Quantos valores você quer somar?");
        int quantidadeValores = scanner.nextInt();

        double[] listaValores = new double[quantidadeValores];

        for (int i = 0; i < quantidadeValores; i++) {
            System.out.println("Digite o valor " + (i + 1) + ": ");
            listaValores[i] = scanner.nextDouble();
        }

        double resultado = soma(listaValores);
        System.out.println("Eis o resultado nego vei: " + resultado);
    }

    public static double soma(double[] valores) {
        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma;
    }
}
