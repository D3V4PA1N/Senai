package ExercíciosMatematica;

import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print(" Insira o valor do cateto oposto: ");
        double cateto1 = scanner.nextDouble();

        System.out.print("Insira o valor do cateto adjacente: ");
        double cateto2 = scanner.nextDouble();

        double x = (cateto1 * cateto1) + (cateto2 * cateto2);
        double hipotenusa = Math.sqrt(x);

        System.out.println("O valor da hipotenusa é: " + hipotenusa);
    }
    
}
// Hipotenusa: 5