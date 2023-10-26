package Exercios2;

import java.util.Scanner;;

public class Circulo {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do Raio do circulo: ");
        double raio = Double.parseDouble(scanner.nextLine());

        double pi = 3.14;

        double perimetro = 2 * pi * raio;
        double area = pi * (raio * raio);

        System.out.println( "O valor do perímetro do circulo é de : " + perimetro);
        System.out.println("O valor da área do circulo é de: " + area);


    }
    
}
