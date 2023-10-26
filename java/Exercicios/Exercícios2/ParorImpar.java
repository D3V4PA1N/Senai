package Exercios2;

import java.util.Scanner;

public class ParorImpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um valor numérico: ");
        int valor = scanner.nextInt();

        if (valor % 2 == 0) {
            System.out.print("O número é par.");
        } else {
            System.out.print("O número é impar. ");
        }

    }
    
}
