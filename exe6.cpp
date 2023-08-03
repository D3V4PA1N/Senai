#include <iostream>

using namespace std;

int main () {
    const int SIZE = 5;
    int gols[SIZE];
    int totalGols = 0;

    cout << "Escreva a quantidade de gols marcados: " << endl;

    for ( int i = 0; i < SIZE; i++) {
        cout << "Partida " << i + 1 << ": ";
        cin >> gols[i];
        totalGols += gols[i];
    }

    cout << "O total de gols marcados pela seleçâo é: " << totalGols << endl;

    return 0;



}

