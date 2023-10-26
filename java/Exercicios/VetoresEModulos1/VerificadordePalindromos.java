package VetoresEModulos1;

import java.util.Scanner;

public class VerificadordePalindromos {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite uma palavra ou frase:");
        String palavra = sc.nextLine();
        
        String palindromo = inverterPalavra(palavra);
        
        if(palindromo.equals(palavra)) {
            System.out.print("É um palíndromo!" + "\n" + palindromo);
        }
        else {
            System.out.print("Não é um palíndromo!" + "\n" + palindromo);
        }
        
        sc.close();
    }
    
    public static String inverterPalavra(String palavra) {
        String palindromo = "";
        
        for(int i = palavra.length() -1; i >= 0; i--){
            palindromo += palavra.charAt(i);
        }
        
        return palindromo;
    }
}