import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas notas você deseja digitar? ");
        int quantidade = scanner.nextInt();

        double[] notas = new double[quantidade];
        double soma = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / quantidade;

        System.out.printf("A média das notas é: %.2f%n", media);

        scanner.close();
    }
}
