package VetoresEMatrizes;

import java.util.Scanner;

public class VerficacaoDeNumerosPerfeitos {
      public static boolean NumeroPerfeito(int num) {
        int soma= 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                soma += i;
            }
        }
       
        if (soma == num) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        
        if (NumeroPerfeito(num)) {
            System.out.println(num + " é um número perfeito.");
        } else {
            System.out.println(num+ " não é um número perfeito.");
        }

        scanner.close();
    }
}