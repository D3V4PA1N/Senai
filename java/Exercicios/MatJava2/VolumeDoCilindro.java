package MatJava2;

public class VolumeDoCilindro {
    public static void main (String[] args) {
        double volume = 785;
        double altura = 13;

        double temp = (4 * volume) / (altura * Math.PI);
        double diametro = Math.sqrt(temp);

        double raio = diametro / 2;

        System.out.println("O raio da base é igual a: " + raio);


    }
    
}
