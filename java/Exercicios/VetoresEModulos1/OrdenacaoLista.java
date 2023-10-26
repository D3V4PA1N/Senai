import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenacaoLista {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = lerLista(scanner);
        ordenarLista(lista);

        System.out.println("Lista original: " + lista);
        System.out.println("Lista ordenada: " + lista);
    }

    public static ArrayList<Integer> lerLista(Scanner scanner) {
        System.out.print("Digite os números separados por espaços: ");
        String input = scanner.nextLine();
        String[] numerosStr = input.split(" ");
        ArrayList<Integer> lista = new ArrayList<>();

        for (String numeroStr : numerosStr) {
            lista.add(Integer.parseInt(numeroStr));
        }

        return lista;
    }

    public static void ordenarLista(ArrayList<Integer> lista) {
        Collections.sort(lista);
    }
}

