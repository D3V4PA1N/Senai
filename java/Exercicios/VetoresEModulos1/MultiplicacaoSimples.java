package VetoresEModulos1;

import java.util.Scanner;

public class MultiplicacaoSimples {
    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int resultado = multiplicar(num1, num2);
        System.out.println("Resultado: " + resultado);
    }
}