package Exercios2;

import java.util.Scanner;

public class AreaDoRetangulo { 
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor da altura: ");
        double altura = scanner.nextInt();

        System.out.print("Insira o valor da base: ");
        double base = scanner.nextDouble();
        
        double area =  base * altura / 2;

        System.out.println("A area do retângulo é: " + area);

        }
}
    
    

