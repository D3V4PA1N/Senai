import java.util.Scanner;

public class CalculadoraMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = lerNotas(scanner);
        double media = calcularMedia(notas);
        exibirMedia(media);
    }

    public static double[] lerNotas(Scanner scanner) {
        System.out.print("Digite as notas separadas por espaços: ");
        String[] notaStr = scanner.nextLine().split(" ");
        double[] notas = new double[notaStr.length];

        for (int i = 0; i < notaStr.length; i++) {
            notas[i] = Double.parseDouble(notaStr[i]);
        }

        return notas;
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }

        return notas.length > 0 ? soma / notas.length : 0.0;
    }

    public static void exibirMedia(double media) {
        System.out.println("Média das notas: " + media);
    }
}
