package ExercíciosMatematica;

import java.util.Scanner;

public class VolumeEsfera {
    public static void main(String[] args) {
    
            Scanner scanner = new Scanner(System.in);

            System.out.print("Insira o valor do raio: ");
            double raio = scanner.nextDouble();

            double pi = 3.14;

            double volume =  (4 * pi * (raio * raio * raio) ) / 3;

            System.out.println("O volume da esfera é igual a: " + volume );



        }
    }
    
// Resultado: V= 523.33