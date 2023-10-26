// Caso a aresta seja 7 o cubo terá a área de 294, e o volume de 343.
package ExercíciosMatematica;

import java.util.Scanner;

public class AreadoCubo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da aresta: ");
        double aresta = sc.nextDouble();

        double volume = aresta * aresta * aresta;
        double area = 6 * (aresta * aresta);

        System.out.println("O volume do cubo é: " + volume);
        System.out.println("A área do cubo é: " + area);
    }
}
