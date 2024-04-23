import java.util.Scanner;

public class Divisao {
    public static void fazDivisao(Scanner scanner){
        System.out.println("Fala feioso! Diz ae, quantos numeros voce deseja subtrair??");
        int quantidadeValores = scanner.nextInt();

        double[] listaValores = new double[quantidadeValores];

        for (int i = 0 ; i < quantidadeValores ; i++) {
            System.out.println("Digite o valor " + (i + 1) + ": ");
            listaValores[i] = scanner.nextDouble();
        }

        double resultado = Divisao(listaValores);
        System.out.println("O resultado é: " + resultado);
    }

    public static double Divisao(double[] valores) {
        double resultado = valores[0];
        for (int i = 1; i < valores.length ; i++) {
            resultado /= valores [i];
        }
        return resultado;
    }
}