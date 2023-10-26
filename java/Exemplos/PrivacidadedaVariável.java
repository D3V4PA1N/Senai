public class PrivacidadedaVariável {
    private int variavelPrivada = 10;
    public int variavelPublica = 20;

    public void metodoExemplo() {
        int variavelLocal = 30;
        System.out.println("Variável privada: " + variavelPrivada);
        System.out.println("Variável pública: " + variavelPublica);
        System.out.println("Variável Local: " + variavelLocal);
    }

    public static void main(String[] args) {
        PrivacidadedaVariável exemplo = new PrivacidadedaVariável();
        exemplo.metodoExemplo();
        System.out.println("Variável Pública: " + exemplo.variavelPublica);
    }
}
