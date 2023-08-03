#include <iostream>
using namespace std;

int main() {
    int espectadores[10];
    int contador = 0;

    //Solicita ao usuário o número de espectadores em cada jogo
    for (int i = 0; i < 10; i++) {
        cout << "Digite o número de espectadores no jogo " << i+1 << ": ";
        cin >> espectadores[i];
    }

    //Verifica o número de jogos com público superior a 50.000 espectadores
    for (int i = 0; i < 10; i++) {
        if (espectadores[i] > 50000) {
            contador++;
        }
    }

    //Exibe o número de jogos com o público superior a 50.000 espectadores
    cout << "Número de jogos com público superior a 50.000 espectadores: " << contador << endl;
}