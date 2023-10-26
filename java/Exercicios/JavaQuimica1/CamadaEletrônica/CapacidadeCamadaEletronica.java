package JavaQuimica1.CamadaEletrônica;

public class CapacidadeCamadaEletronica {

    public static void main(String[] args) {
        int camada = 3;
        int maxEletrons = calcularMaxEletronsNaCamada(camada);
        System.out.println("A terceira camada pode acomodar até " + maxEletrons + " elétrons.");
    }

    public static int calcularMaxEletronsNaCamada(int n) {
        return 2 * n * n;
    }
}
    

