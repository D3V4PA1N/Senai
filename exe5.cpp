#include <iostream>
#include <string>

using namespace std;

int main () {
    const int SIZE = 7;
    string paises[SIZE] = {"USA", "China", "Suécia", "Alemanha", "Canadá", "França", "Inglaterra"};
    string sigla;

    cout << "Digite a sigla de um país:";
    cin >> sigla;

    bool encontrado = false;

    for (int i = 0; i < SIZE; ++i) {
        if (paises[i] == sigla) {
            encontrado = true;
            break;
        }
    }

    if (encontrado) {
        cout << "A sigla " << sigla << "está presente no vetor." << endl;
    } else {
        cout << "A sigla " << sigla << " não está presente no vetor." << endl;
    }

    return 0;
}