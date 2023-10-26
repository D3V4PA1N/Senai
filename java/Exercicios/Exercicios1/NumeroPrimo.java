public class NumeroPrimo {
    public static void main (String[] args) {
        int numero = 9;

            boolean primo = true;
            for (int i = 2; i < numero; i ++) {
                if (numero % i == 0) {
                    primo = false;
                }
            }
            if (primo) {
              System.out.println("O número é primo " );
            } else {
                System.out.println("O número não é primo");
            }

        }
    }


      
