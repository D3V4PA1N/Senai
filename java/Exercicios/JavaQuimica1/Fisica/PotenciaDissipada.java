package JavaQuimica1.Fisica;

public class PotenciaDissipada {
    public static void main (String[] args) {
        double tensao = 24;
        double resistencia = 8;

        double PotenciaDissipada =  (tensao * tensao) / resistencia;

        System.out.println("A Potência dissipda é igual á: " + PotenciaDissipada + " W");
    
    }
    
}
