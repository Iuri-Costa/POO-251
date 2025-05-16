import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pergunta ao usuário quantas notas deseja digitar
        System.out.print("Quantas notas você deseja digitar? ");
        int quantidade = scanner.nextInt();

        // Cria um array para armazenar as notas
        double[] notas = new double[quantidade];
        double soma = 0;

        // Lê as notas e armazena no array
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        // Calcula a média
        double media = soma / quantidade;

        // Exibe a média
        System.out.printf("A média das notas é: %.2f%n", media);

        scanner.close();
    }
}
