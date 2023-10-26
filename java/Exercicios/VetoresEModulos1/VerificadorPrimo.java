import java.util.Scanner;

public class VerificadorPrimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (ehPrimo(numero)) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
        }
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false; 
        }

        if (numero <= 3) {
            return true; 
        }

        if (numero % 2 == 0 || numero % 3 == 0) {
            return false; 
        }

        return true; 
    }
}

