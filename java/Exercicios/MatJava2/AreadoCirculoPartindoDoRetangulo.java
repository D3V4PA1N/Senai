package MatJava2;

public class AreadoCirculoPartindoDoRetangulo {
    public static void main (String[] args) {
        double largura = 10;
        double Comprimeto = 20;

        double PeriRetangulo = 2 * (largura + Comprimeto);
        double RaiodoCirculo = PeriRetangulo / (2 * Math.PI);
        double AreadoCirculo = Math.PI * (RaiodoCirculo * RaiodoCirculo);

        System.out.println("A area do circulo, calculada a partir do circulo é igual á: " + AreadoCirculo);
       
}
}
