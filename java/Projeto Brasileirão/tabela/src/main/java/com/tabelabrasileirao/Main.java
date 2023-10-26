//Wendel Vinícius
//Pedro Lucas Miranda

package com.tabelabrasileirao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] times = { "América Mineiro", "Athletico-PR", "Atlético Mineiro", "Bahia", "Botafogo",
                "Corinthians", "Coritiba", "Cruzeiro", "Cuiabá", "Flamengo",
                "Fluminense", "Fortaleza", "Goiás", "Grêmio", "Internacional",
                "Palmeiras", "Red Bull Bragantino", "Santos", "São Paulo", "Vasco" };

        int[] pontuacoes = new int[times.length];

        int[] cartoesAmarelos = new int[times.length];

        int[] vitorias = new int[times.length];

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção: ");
            System.out.println("1 - Visualizar Tabela");
            System.out.println("2 - Editar Pontuação");
            System.out.println("3 - Cartões Amarelos");
            System.out.println("4 - Editar Vitórias");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 0:
                    scanner.close();
                    return;
                case 1:
                    exibirTabela(times, pontuacoes, cartoesAmarelos, vitorias);
                    break;
                case 2:
                    editarPontuacao(times, pontuacoes, cartoesAmarelos, vitorias, scanner);
                    break;
                case 3:
                    editarCartoesAmarelos(times, pontuacoes, cartoesAmarelos, vitorias, scanner);
                    break;
                case 4:
                    exibirTabelaComVitorias(times, pontuacoes, cartoesAmarelos, vitorias, scanner);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;

            }
        }
    }

    private static void editarCartoesAmarelos(String[] times, int[] pontuacoes, int[] cartoesAmarelos, int[] vitorias,
            Scanner scanner) {
        while (true) {
            System.out.println("\nTimes disponíveis para edição:");
            exibirTimes(times, pontuacoes, cartoesAmarelos, vitorias);
            System.out.println("Escolha o número do time para editar os cartões amarelos (ou 0 para voltar): ");
            int posicao = scanner.nextInt();
            if (posicao == 0) {
                break;
            }
            if (posicao >= 1 && posicao <= times.length) {
                System.out.println("Digite o novo número de cartões amarelos para " + times[posicao - 1] + ":");
                int novosCartoes = scanner.nextInt();
                if (novosCartoes >= 0) {
                    cartoesAmarelos[posicao - 1] = novosCartoes;
                } else {
                    System.out.println("O número de cartões amarelos não pode ser negativo.");
                }
            } else {
                System.out.println("Posição inválida. Tente novamente.");
            }
            scanner.nextLine();
        }
    }

    public static void exibirTabela(String[] times, int[] pontuacoes, int[] cartoesAmarelos, int[] vitorias) {
        ordenarPorPontuacaoECartoesEVitorias(times, pontuacoes, cartoesAmarelos, vitorias);
        System.out.println(
                "\033[1m----------------------------------------------------------------------------------|\033[0m");
        System.out.println(
                "\033[1m| \033[34mPosições  \033[0m|  \033[34mTime                \033[0m|  \033[34mVitórias \033[0m| \033[34mPontuações   \033[0m|  \033[34mCartões Amarelos \033[0m|");
        System.out.println(
                "\033[1m----------------------------------------------------------------------------------|\033[0m");
        for (int i = 0; i < times.length; i++) {
            System.out.format(
                    "\033[1m| \033[33m%-9d \033[0m| \033[37m%-20s \033[0m| \033[36m%-9d \033[0m| \033[32m%-12d \033[0m| \033[31m%-17d \033[0m|\n",
                    (i + 1), times[i], vitorias[i], pontuacoes[i], cartoesAmarelos[i]);
        }
        System.out.println(
                "\033[1m----------------------------------------------------------------------------------|\033[0m");
    }

    public static void exibirTimes(String[] times, int[] pontuacoes, int[] cartoesAmarelos, int[] vitorias) {
        ordenarPorPontuacaoECartoesEVitorias(times, pontuacoes, cartoesAmarelos, vitorias);
        System.out.println("\033[1m----------------------------------------------------------------------------------|\033[0m");
        System.out.println("| \033[34mPosições  \033[0m|  \033[34mTime                \033[0m|  \033[34mVitórias  \033[0m| \033[34mPontuações  \033[0m|  \033[34mCartões Amarelos \033[0m|");
        System.out.println("\033[1m----------------------------------------------------------------------------------|\033[0m");
        
        for (int i = 0; i < times.length; i++) {
            System.out.format("| \033[33m%-9d \033[0m| \033[37m%-20s \033[0m| \033[36m%-9d \033[0m| \033[32m%-12d \033[0m| \033[31m%-17d \033[0m|\n", (i + 1), times[i], vitorias[i], pontuacoes[i], cartoesAmarelos[i]);
        }
        
        System.out.println("\033[1m----------------------------------------------------------------------------------|\033[0m");
    }
    

    public static void editarPontuacao(String[] times, int[] pontuacoes, int[] cartoesAmarelos, int[] vitorias,
            Scanner scanner) {

        while (true) {
            System.out.println("\nTimes disponíveis para edição:");
            exibirTimes(times, pontuacoes, cartoesAmarelos, vitorias);
            System.out.println("Escolha o número do time para editar a pontuação (ou 0 para voltar): ");

            int posicao = scanner.nextInt();

            if (posicao == 0) {
                break;
            }
            if (posicao >= 1 && posicao <= times.length) {
                System.out.println("Digite a nova pontuação para " + times[posicao - 1] + ":");
                int novaPontuacao = scanner.nextInt();
                if (novaPontuacao >= 0) {
                    pontuacoes[posicao - 1] = novaPontuacao;
                } else {
                    System.out.println("A pontuação não pode ser negativa.");
                }
            } else {
                System.out.println("Posição inválida. Tente novamente. ");
            }
            scanner.nextLine();
        }
        ordenarPorPontuacaoECartoesEVitorias(times, pontuacoes, cartoesAmarelos, vitorias);
    }

    public static void ordenarPorPontuacaoECartoesEVitorias(String[] times, int[] pontuacoes, int[] cartoesAmarelos, int[] vitorias) {
        for (int i = 0; i < pontuacoes.length - 1; i++) {
            for (int j = i + 1; j < pontuacoes.length; j++) {
                if (pontuacoes[i] < pontuacoes[j] || (pontuacoes[i] == pontuacoes[j] && cartoesAmarelos[i] > cartoesAmarelos[j]) || (pontuacoes[i] == pontuacoes[j] && cartoesAmarelos[i] == cartoesAmarelos[j] && vitorias[i] < vitorias[j])) {
                    // Troca a posição dos times, pontuações, cartões amarelos e vitórias
                    int tempPontuacao = pontuacoes[i];
                    pontuacoes[i] = pontuacoes[j];
                    pontuacoes[j] = tempPontuacao;

                    int tempCartoes = cartoesAmarelos[i];
                    cartoesAmarelos[i] = cartoesAmarelos[j];
                    cartoesAmarelos[j] = tempCartoes;

                    int tempVitoria = vitorias[i];
                    vitorias[i] = vitorias[j];
                    vitorias[j] = tempVitoria;

                    String tempTime = times[i];
                    times[i] = times[j];
                    times[j] = tempTime;
                }
            }
        }
    }
    
    

    public static void exibirTabelaComVitorias(String[] times, int[] pontuacoes, int[] cartoesAmarelos, int[] vitorias,
            Scanner scanner) {
        while (true) {
            System.out.println("\nTimes disponíveis para edição:");
            exibirTimes(times, pontuacoes, cartoesAmarelos, vitorias);
            System.out.println("Escolha o número do time para editar o número de vitórias (ou 0 para voltar): ");
            int posicao = scanner.nextInt();
            if (posicao == 0) {
                break;
            }
            if (posicao >= 1 && posicao <= times.length) {
                System.out.println("Digite o novo número de vitórias para " + times[posicao - 1] + ":");
                int novaVitoria = scanner.nextInt();
                if (novaVitoria >= 0) {
                    vitorias[posicao - 1] = novaVitoria;
                } else {
                    System.out.println("O número de vitórias não pode ser negativo.");
                }
            } else {
                System.out.println("Posição inválida. Tente novamente.");
            }
            scanner.nextLine();
        }
    }
}
