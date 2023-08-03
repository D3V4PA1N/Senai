#include <iostream>
#include <string>

using namespace std;

int main() {
    string selecoes[8];

    // Solicita ao usuário os nomes das seleções
    for (int i = 0; i < 8; i++) {
        cout << "Digite o nome da seleção " << i+1 << ": ";
        getline(cin, selecoes[i]);
    }

    // Inverte a ordem dos nomes no vetor
    for (int i = 0; i < 4; i++) {
        string temp = selecoes[i];
        selecoes[i] = selecoes[7-i];
        selecoes[7-i] = temp;
    }

    // Exibe os nomes das seleções em ordem inversa
    cout << "Nomes das seleções em ordem inversa:" << endl;
    for (int i = 0; i < 8; i++) {
        std::cout << selecoes[i] << endl;
    }

    return 0;
}