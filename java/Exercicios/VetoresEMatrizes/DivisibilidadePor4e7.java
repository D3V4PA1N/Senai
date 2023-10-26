package VetoresEMatrizes;

import java.util.Scanner;

public class DivisibilidadePor4e7 {

    public static int Divisao(int numero) {
        if (numero % 4 == 0 && numero % 7 == 0){
            System.out.println(" O número é divisível por 4 e 7.");
        } else {
            System.out.println(" O número não é divisível por 4 e 7.");
        }

        return numero;
        
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();


        System.out.println(Divisao(numero));

        sc.close();



        
    }
    
}
