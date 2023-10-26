public class MaiorDivisor {
    public static void main(String[] args) {
        int numero = 54;
        int maiorDivisor = 1;

        for (int i = 2; i <= numero; i++) {
            if (numero % i == 0) {
                maiorDivisor = i;
            }
        }
        System.out.println("Maior divisor é: " + maiorDivisor);
    }
}
