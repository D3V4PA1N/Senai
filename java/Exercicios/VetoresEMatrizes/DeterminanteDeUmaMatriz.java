package VetoresEMatrizes;


public class DeterminanteDeUmaMatriz {
    public static void main(String[] args) {
        int[][] matriz = {{2, 3}, {4, 1}};
        
        int determinante = calcularDeterminante(matriz);
        System.out.println("Determinante: " + determinante);
    }
    
    public static int calcularDeterminante(int[][] matriz) {
        int determinante = matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        return determinante;
    }
}