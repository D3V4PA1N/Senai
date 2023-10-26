//(b_1 = 8)(b_2 = 5) e (h = 6) = 39
package ExercíciosMatematica;

import java.util.Scanner;

public class ÀreadoTrapézio {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Insira o valor da base maior: " );
        double maior = sc.nextDouble();

        System.out.print("Insira o valor da base menor: ");
        double menor = sc.nextDouble();

        System.out.print("Insira a altura: ");
        double altura = sc.nextDouble();

        double area = (maior + menor) * altura / 2;

        System.out.println("A área do trapézio é: "+ area ) ;
    }
}
