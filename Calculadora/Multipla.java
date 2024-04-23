import java.util.Scanner;

public class Multipla {
    public static void fazMultipla(Scanner scanner){
        System.out.println("Fala feioso! Diz ae, quantos numeros voce deseja subtrair??");
        int quantidadeValores = scanner.nextInt();

        double[] listaValores = new double[quantidadeValores];

        for (int i = 0 ; i < quantidadeValores ; i++) {
            System.out.println("Digite o valor " + (i + 1) + ": ");
            listaValores[i] = scanner.nextDouble();
        }

        double resultado = Multipla(listaValores);
        System.out.println("O resultado é: " + resultado);
    }

    public static double Multipla(double[] valores) {
        double resultado = valores[0];
        for (int i = 1; i < valores.length ; i++) {
            resultado *= valores [i];
        }
        return resultado;
    }
}