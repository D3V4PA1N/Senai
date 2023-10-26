package VetoresEModulos1;

public class ParesEmUmArray {
    public static void main(String[] args) {
        int[] numeros = {2, 3, 6, 8, 10, 11};
        int soma = somaDosPares(numeros);
        System.out.println("A soma dos pares do array é: " + soma);
        
    }

    public static int somaDosPares(int[] array) {
        int soma = 0;
        for (int num : array) {
            if (num % 2 == 0) soma += num;
        }
        return soma;
        
    }
}
