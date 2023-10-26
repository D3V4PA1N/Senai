package VetoresEMatrizes;

import java.util.Scanner;

public class PerimetroDoQuadrado {

    public static double PerimetroQuadrado(double lado) {
        return 4 * lado;
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o comprimento do lado do quadrado: ");
        double lado = sc.nextDouble();

        double resultado = PerimetroQuadrado(lado);
        System.out.println(" Perímetro do quadrado: " + resultado);

        sc.close();

        
    }
    
}
