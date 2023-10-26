public class Fatorial {
    public static void main(String[] args) {
        int fatorial = 1;
        double valor = 10; 
        
        for( int i = 2; i <= valor; i++ )
        {
        fatorial *= i;
        }
        
        System.out.println( "O fatorial de " + valor + " é igual a " + fatorial );
        }

}