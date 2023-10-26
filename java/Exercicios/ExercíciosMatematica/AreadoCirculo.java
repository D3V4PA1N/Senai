package ExercíciosMatematica;

import java.util.Scanner;

public class AreadoCirculo {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do Raio do circulo: ");
        double raio = Double.parseDouble(scanner.nextLine());

        double pi = 3.14;

        double area = pi * (raio * raio);

        System.out.println("O valor da área do circulo é de: " + area);




    }
}
//Area = 78.5