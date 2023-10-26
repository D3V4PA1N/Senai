package MatJava2;

public class VolumedoCone {
    public static void main(String[] args) {
        double volume = 94;
        double altura = 9;

        double temp = (Math.PI * altura ) / 3;
        double temp2 = temp / volume;
        double raio = Math.sqrt(temp2);

        System.out.println("O raio da base do cone é igual á: " + raio);
    }
}
