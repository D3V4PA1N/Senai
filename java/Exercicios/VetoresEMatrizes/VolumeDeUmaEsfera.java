package VetoresEMatrizes;

import java.util.Scanner;

public class VolumeDeUmaEsfera {
    public static double CalcularVolume(double raio) {
       double volume = (4 * Math.PI * (raio * raio * raio) ) / 3;
       return volume;
        
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print(" Digite o raio da esfera: ");
        double raio = sc.nextDouble();

        double resu = CalcularVolume(raio);
        System.out.println("Volume da esfera: " + resu);

        sc.close();

        
        
    }

    
}
