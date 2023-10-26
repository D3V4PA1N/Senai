package VetoresEMatrizes;

import java.util.Scanner;

public class AreaDoTrapezio {
    public static double AreaTrapezio(double baseMaior, double baseMenor, double altura) {
       return  ((baseMaior + baseMenor) * altura) / 2;
    
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base maior do trapézio: ");
        double baseMaior = sc.nextDouble();

        System.out.print("Digite a base menor do trapézio: ");
        double baseMenor = sc.nextDouble();

        System.out.print("Digite a altura do trapézio: ");
        double altura = sc.nextDouble();

        double resultado = AreaTrapezio(baseMaior, baseMenor, altura);
        System.out.println("Resultado: " + resultado);

        sc.close();




        
    }
    
}
