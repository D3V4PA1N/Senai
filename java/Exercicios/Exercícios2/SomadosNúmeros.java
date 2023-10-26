package Exercios2;

import java.util.Scanner;

public class SomadosNúmeros {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor do primeiro número: ");
        float numero1 = scanner.nextInt();

        System.out.print("Insira o valor do segundo número: ");
        float numero2 = scanner.nextInt();

        float soma = numero1 + numero2;
        
        System.out.println("A soma dos valores é: " + soma);

    }
    
}
