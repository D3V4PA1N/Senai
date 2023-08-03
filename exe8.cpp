#include <iostream>
using namespace std;

int main() {
    int datas[6];

    //Solicita ao usuário as datas dos jogos
    for (int i = 0; i < 6; i++) {
        cout << "Digite a data do jogo" << i+1 << ": ";
        cin >> datas[i];
    }

    //Inverter a ordem das datas no vetor
    for (int i = 0; i < 3; i++) {
        int temp = datas[i];
        datas[i] = datas[5-i];
        datas[5-i] = temp;
    }

    //Exibe o vetor resultante
    cout << "Vetor resultante: ";
    for (int i = 0; i < 6; i++) {
        cout << datas[i] << " ";
    }
    cout << std::endl;

    return 0;
}