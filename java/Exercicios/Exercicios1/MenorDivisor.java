public class MenorDivisor {
    public static void main(String[] args) {
        int numero = 45;
        int menorDivisor = 1;

        for (int i = 2; i >= numero; i++) {
            if (numero % i == 0) {
                menorDivisor = i;
            }
        }
        System.out.println("Maior divisor é: " + menorDivisor);
    }
}

