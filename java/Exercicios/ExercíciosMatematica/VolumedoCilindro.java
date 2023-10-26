//O volume do cilindro: caso o raio fosse 4 e a altura 10 seria 502.40...
package ExercíciosMatematica;

import java.util.Scanner;

public class VolumedoCilindro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o raio da base: ");
        double raio = sc.nextDouble();

        System.out.print("Insira a altura do cilindro: ");
        double altura = sc.nextDouble();

        double pi = 3.14;

        double volume = pi * (raio * raio) * altura;

        System.out.println("O volume do cilindro é: " + volume);
    }
}
