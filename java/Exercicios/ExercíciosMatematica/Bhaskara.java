//(3x^2 - 7x + 2 = 0\) = x1: 0,3333 (unica raiz positiva)
//(2x^2 + 5x - 3 = 0\) = x1: -1; x2: -1,5

package ExercíciosMatematica;

import java.util.Scanner;;

public class Bhaskara {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do coeficiente A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor do coeficiente B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor do coeficiente C: ");
        double c = scanner.nextDouble();

        double delta = b * b -4 * (a*c);
        if(delta < 0 ){ 
          double x = -b / (2*a);
          System.out.println("A equação possui uma raiz real: " + x);
        }else {
            double x1 = (-b+ Math.sqrt(delta) ) / (2*a);
        }
        scanner.close();
    }

    
    
}
