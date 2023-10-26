import java.util.Scanner;

public class ContadorVogais {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        int numeroDeVogais = contarVogais(frase);
        System.out.println("Número de vogais: " + numeroDeVogais);
    }

    public static int contarVogais(String frase) {
        int contador = 0;
        frase = frase.toLowerCase(); 
        for (int i = 0; i < frase.length(); i++) {
            char caractere = frase.charAt(i);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contador++;
            }
        }
        
        return contador;
    }
}
