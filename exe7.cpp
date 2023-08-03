#include <iostream>

using namespace std;

int main () {
    int golsMarcados[5];
    int golsSofridos[5];
    int saldoGols[5];

    // Solicita ao usuário a quantidade de gols marcados e gols sofridos em cada partida
    for (int i = 0; i < 5; i++) {
        cout << "Partida " << i+1 << ": " << endl;
        cout << "Digite a quantidade de gols marcados: ";
        cin >> golsMarcados[i];
        cout << "Digite a quantidade de gols sofridos: ";
        cin >> golsSofridos[i];
    }

    // Calcular o saldo de gols para cada partida
    for (int i = 0; i < 5; i++) {
        saldoGols[i] = golsMarcados[i] - golsSofridos[i];
    }

    // Exibir o saldo de gols
    for (int i = 0; i < 5; i++) {
        cout << "Partida " << i+1 << ": Saldo de gols = " << saldoGols[i] << endl;
    }

    return 0; 
}