package VetoresEMatrizes;

import java.util.Scanner;

public class FatorialDeUmNumero {
    public static int CalcularFatorial(int fatorial, double numero) {
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int fatorial = 1;

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println(CalcularFatorial(fatorial, numero));

         scanner.close();
        
    }
    
}
