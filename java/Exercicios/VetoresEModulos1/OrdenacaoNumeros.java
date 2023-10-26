package VetoresEModulos1;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenacaoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Lê a lista de números do usuário

        System.out.print("Digite a lista de números separados por vírgulas: ");
        String listaNumeros = scanner.nextLine();
        int[] numeros = converterListaParaArray(listaNumeros);
        ordenarNumeros(numeros);

        // Imprime a lista ordenada
        System.out.println("Lista ordenada: " + Arrays.toString(numeros));
    }

    public static int[] converterListaParaArray(String listaNumeros) {
        String[] numerosString = listaNumeros.split(",");
        int[] numeros = new int[numerosString.length];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(numerosString[i]);
        }
        return numeros;
    }

    public static void ordenarNumeros(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
    }
}