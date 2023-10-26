package ExercíciosMatematica;

import java.util.Scanner;

public class volumeDaPiramide {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva o valor do lado da pirâmide: ");
        double lado = scanner.nextDouble();

        System.out.print("Escreva o valor da altura da pirâmide: ");
        double altura = scanner.nextDouble();

        double volume = (altura * (lado * lado ) ) / 3;

        System.out.println( " O volume da pirâmide de base quadrangular é igual á: " + volume);


    }
    
}

//Volume = 96