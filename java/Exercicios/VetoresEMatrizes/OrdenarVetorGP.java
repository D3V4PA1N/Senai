package VetoresEMatrizes;

public class OrdenarVetorGP {

    public static void main(String[] args) {
        int [] vetorGP  = {9, 15, 19, 21, 1, 59, 10, 11 ,32};
        
        OrdenarVetorGP(vetorGP);

        System.out.print("Lista ordenada: ");
        for (int i = 0; i < vetorGP.length; i++) {
            System.out.print(vetorGP[i] + " ");
        }
    }
    
    public static void OrdenarVetorGP(int[] vetorGP) {
        for (int i = 0;  i < vetorGP.length - i - 1; i++) {

            for (int j = 0; j < vetorGP.length -i -1; j++) {
                if(vetorGP[j] > vetorGP[j +1]) {
                    int temp = vetorGP[j];
                    vetorGP[j] = vetorGP[j + 1];
                    vetorGP[j + 1] = temp;
                }
             }
          }
        }
    }
